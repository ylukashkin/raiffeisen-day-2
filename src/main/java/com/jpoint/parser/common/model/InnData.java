package com.jpoint.parser.common.model;

public class InnData {
    private final String top;
    private final String middle;
    private final String bottom;

    public InnData(String top, String middle, String bottom) {
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
    }

    public String getTop() {
        return top;
    }

    public String getMiddle() {
        return middle;
    }

    public String getBottom() {
        return bottom;
    }
}
