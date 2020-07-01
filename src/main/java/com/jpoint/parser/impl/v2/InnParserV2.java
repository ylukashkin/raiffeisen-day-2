package com.jpoint.parser.impl.v2;

import com.jpoint.parser.InnParser;
import com.jpoint.parser.common.ExtractNumber;
import com.jpoint.parser.common.ResultConverter;
import com.jpoint.parser.common.model.InnData;

import java.util.ArrayList;
import java.util.List;


public class InnParserV2 implements InnParser {
    private final ExtractNumber extractNumber;
    private final ResultConverter resultConverter;

    public InnParserV2(ExtractNumber extractNumber, ResultConverter resultConverter) {
        this.extractNumber   = extractNumber;
        this.resultConverter = resultConverter;
    }

    @Override
    public Integer parse(InnData inn) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= INN_SIZE; i++) {
            List<String> number = extractNumber.extractToStrings(inn, i);
            int sum = 0;
            for (int j = 1; j <= number.size(); j++) { // size = 3
                sum = sum + NumberBlock.BLOCKS.get(number.get(j - 1)) * j;
            }
            result.add(NumberBlock.NUMBERS.get(sum));
        }
        return resultConverter.convert(result);
    }
}
