package com.jpoint.parser.common.impl;

import com.jpoint.parser.common.ResultConverter;

import java.util.List;

public class ResultConverterImpl implements ResultConverter {

    @Override
    public Integer convert(List<Integer> numbers) {
        StringBuilder buffer = new StringBuilder();
        numbers.forEach(buffer::append);
        return Integer.parseInt(buffer.toString());
    }
}
