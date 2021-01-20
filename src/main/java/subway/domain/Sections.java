package subway.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sections {
    private final List<Section> sections;
    private static final int MIN_SECTION_SIZE = 1;

    public Sections(List<Section> sections) {
        this.sections = sections;
    }

    public Section findMatchSection(Section newSection) {
        return sections.stream()
                .filter(section -> section.isInsert(newSection))
                .findFirst()
                .orElse(null);
    }

    public boolean validateSectionDelete() {
        if (sections.size() == MIN_SECTION_SIZE) {
            return false;
        }
        return true;
    }

    public List<Section> findDeleteSections(Long stationId) {
        return sections.stream()
                .filter(section -> section.isContainStation(stationId))
                .collect(Collectors.toList());
    }

    public Map<Long, Long> getSectionMap() {
        Map<Long, Long> sectionMap = new HashMap<>();
        for (Section section : sections) {
            sectionMap.put(section.getUpStationId(), section.getDownStationId());
        }
        return sectionMap;
    }

}