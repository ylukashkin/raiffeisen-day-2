package com.jpoint.parser.impl.v1;

import com.jpoint.parser.InnParser;
import com.jpoint.parser.common.ExtractNumber;
import com.jpoint.parser.common.ResultConverter;
import com.jpoint.parser.common.model.InnData;

import java.util.ArrayList;
import java.util.List;


public class InnParserV1 implements InnParser {
    private final ExtractNumber extractNumber;
    private final ResultConverter resultConverter;

    public InnParserV1(ExtractNumber extractNumber, ResultConverter resultConverter) {
        this.extractNumber   = extractNumber;
        this.resultConverter = resultConverter;
    }

    @Override
    public Integer parse(InnData inn) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= INN_SIZE; i++) {
            List<String> number = extractNumber.extractToStrings(inn, i);
            for (InnNumber value : InnNumber.values()) {
                if (value.test(number)) {
                    result.add(value.getNumber());
                    break;
                }
            }
        }
        return resultConverter.convert(result);
    }
}
