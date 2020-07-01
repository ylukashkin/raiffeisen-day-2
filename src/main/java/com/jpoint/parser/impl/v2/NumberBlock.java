package com.jpoint.parser.impl.v2;

import java.util.HashMap;
import java.util.Map;

public class NumberBlock {

    public static final Map<String, Integer> BLOCKS   = buildBlocks();
    public static final Map<Integer, Integer> NUMBERS = buildNumbers();

    private static Map<String, Integer> buildBlocks() {
        Map<String, Integer> buffer = new HashMap<>();

        buffer.put("   ", 1);
        buffer.put(" _ ", 10);
        buffer.put("  |", 100);
        buffer.put(" _|", 1000);
        buffer.put("|_|", 10000);
        buffer.put("|_ ", 100000);
        buffer.put("| |", 1000000);

        return buffer;
    };


    private static Map<Integer, Integer> buildNumbers() {
        Map<Integer, Integer> buffer = new HashMap<>();

        buffer.put(10 + 2 * 1000000 + 3 * 10000, 0);
        buffer.put(1 + 2 * 100 + 3 * 100, 1);
        buffer.put(10 + 2 * 1000 + 3 * 100000, 2);
        buffer.put(10 + 2 * 1000 + 3 * 1000, 3);
        buffer.put(1 + 2 * 10000 + 3 * 100, 4);
        buffer.put(10 + 2 * 100000 + 3 * 1000, 5);
        buffer.put(10 + 2 * 100000 + 3 * 10000, 6);
        buffer.put(10 + 2 * 100 + 3 * 100, 7);
        buffer.put(10 + 2 * 10000 + 3 * 10000, 8);
        buffer.put(10 + 2 * 10000 + 3 * 1000, 9);

        return buffer;
    };
}
