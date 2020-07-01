package com.jpoint.parser.common.impl;

import com.jpoint.parser.common.ExtractNumber;
import com.jpoint.parser.common.model.InnData;

import java.util.Arrays;
import java.util.List;

public class ExtractNumberImpl implements ExtractNumber {
    private static final int NUMBER_SIZE = 3;

    @Override
    public List<String> extractToStrings(InnData inn, int position) {
        final int finish = position * NUMBER_SIZE;
        final int start  = finish - NUMBER_SIZE;
        return Arrays.asList(
                inn.getTop().substring(start, finish),
                inn.getMiddle().substring(start, finish),
                inn.getBottom().substring(start, finish)
        );
    }
}
