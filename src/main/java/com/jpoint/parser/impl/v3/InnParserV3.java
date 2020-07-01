package com.jpoint.parser.impl.v3;

import com.jpoint.parser.InnParser;
import com.jpoint.parser.common.ResultConverter;
import com.jpoint.parser.common.model.InnData;

import java.util.ArrayList;
import java.util.List;


public class InnParserV3 implements InnParser {
    private static final int NUMBER_SIZE = 3;
    private final ResultConverter resultConverter;

    public InnParserV3(ResultConverter resultConverter) {
        this.resultConverter = resultConverter;
    }

    @Override
    public Integer parse(InnData inn) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= INN_SIZE; i++) {
            result.add(InnParserV3Helper.SUM_PER_NUMBER.get(sumForNumber(i, inn)));
        }
        return resultConverter.convert(result);
    }

    private int sumForNumber(int position, InnData inn) {
        final int start = position * NUMBER_SIZE - NUMBER_SIZE;
        int sum = InnParserV3Helper.SCHEME[0][1] == inn.getTop().charAt(start + 1) ? InnParserV3Helper.FLAGS[0][1] : 0; // for first line
        for (int j = 0; j < InnParserV3Helper.SCHEME.length; j++) { // 3
            if (InnParserV3Helper.SCHEME[1][j] == inn.getMiddle().charAt(start + j)) {
                sum = sum + InnParserV3Helper.FLAGS[1][j];
            }
            if (InnParserV3Helper.SCHEME[2][j] == inn.getBottom().charAt(start + j)) {
                sum = sum + InnParserV3Helper.FLAGS[2][j];
            }
        }
        return sum;
    }
}
