package com.jpoint.parser.impl.v1;

import java.util.List;

public enum InnNumber {
    ZERO(
            " _ ",
            "| |",
            "|_|",
            0
    ),
    ONE(
            "   ",
            "  |",
            "  |",
            1
    ),
    TWO(
            " _ ",
            " _|",
            "|_ ",
            2
    ),
    TREE(
            " _ ",
            " _|",
            " _|",
            3
    ),
    FOUR(
            "   ",
            "|_|",
            "  |",
            4
    ),
    FIVE(
            " _ ",
            "|_ ",
            " _|",
            5
    ),
    SIX(
            " _ ",
            "|_ ",
            "|_|",
            6
    ),
    SEVEN(
            " _ ",
            "  |",
            "  |",
            7
    ),
    EIGHT(
            " _ ",
            "|_|",
            "|_|",
            8
    ),
    NINE(
            " _ ",
            "|_|",
            " _|",
            9
    )
    ;

    private final String top;
    private final String middle;
    private final String bottom;
    private final Integer number;

    InnNumber(String top, String middle, String bottom, Integer number) {
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public boolean test(List<String> number) {
        return this.top.equals(number.get(0)) && this.middle.equals(number.get(1)) && this.bottom.equals(number.get(2));
    }
}
