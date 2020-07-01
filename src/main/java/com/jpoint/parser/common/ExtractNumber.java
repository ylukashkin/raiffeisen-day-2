package com.jpoint.parser.common;

import com.jpoint.parser.common.model.InnData;

import java.util.List;

public interface ExtractNumber {
    List<String> extractToStrings(InnData inn, int position); // or String[]
}
