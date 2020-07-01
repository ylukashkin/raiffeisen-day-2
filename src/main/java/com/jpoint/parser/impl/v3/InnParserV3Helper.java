package com.jpoint.parser.impl.v3;

import java.util.HashMap;
import java.util.Map;

public class InnParserV3Helper {
    public static final int[][] FLAGS = new int[][] {
            {0,  2,  0}, // ' _ '
            {4,  8,  16}, // '|_|'
            {32, 64, 128}  // '|_|'
    };

    public static final char[][] SCHEME = new char[][] {
            {' ', '_', ' '},
            {'|', '_', '|'},
            {'|', '_', '|'}
    };

    public static final Map<Integer, Integer> SUM_PER_NUMBER = buildSumPerNumber();

    private static Map<Integer, Integer> buildSumPerNumber() {
        Map<Integer, Integer> sumPerNumber = new HashMap<>();

        sumPerNumber.put(FLAGS[0][1] + FLAGS[1][0] + FLAGS[1][2] + FLAGS[2][0] + FLAGS[2][1] + FLAGS[2][2], 0);
        sumPerNumber.put(144, 1);
        sumPerNumber.put(122, 2);
        sumPerNumber.put(218, 3);
        sumPerNumber.put(156, 4);
        sumPerNumber.put(206, 5);
        sumPerNumber.put(238, 6);
        sumPerNumber.put(146, 7);
        sumPerNumber.put(254, 8);
        sumPerNumber.put(222, 9);

        return sumPerNumber;
    }
}
