package subway.line;

import subway.section.Section;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Line {
    private Long id;
    private String name;
    private String color;
    private Long upStationId;
    private Long downStationId;
    private int distance;

    public Line(Long id, String name, String color, Long upStationId, Long downStationId){
        this.id = id;
        this.name= name;
        this.color = color;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
    }

    public Line(LineRequest lineRequest) {
        this.name = lineRequest.getName();
        this.color = lineRequest.getColor();
        this.upStationId = lineRequest.getUpStationId();
        this.downStationId = lineRequest.getDownStationId();
        this.distance = lineRequest.getDistance();

    }

    public void modify(LineRequest lineRequest) {
        this.name = lineRequest.getName();
        this.color = lineRequest.getColor();
        this.upStationId = lineRequest.getUpStationId();
        this.downStationId = lineRequest.getDownStationId();
        this.distance = lineRequest.getDistance();
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }

    public void setUpStationId(Long upStationId) {
        this.upStationId = upStationId;
    }

    public void setDownStationId(Long downStationId) {
        this.downStationId = downStationId;
    }
}
