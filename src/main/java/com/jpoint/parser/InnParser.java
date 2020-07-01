package com.jpoint.parser;

import com.jpoint.parser.common.model.InnData;

public interface InnParser {
    Integer parse(InnData inn);
    Integer INN_SIZE = 9;
}
