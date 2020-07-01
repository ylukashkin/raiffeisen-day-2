package com.jpoint.parser.impl.v4;

import com.jpoint.parser.InnParser;
import com.jpoint.parser.common.ResultConverter;
import com.jpoint.parser.common.model.InnData;
import com.jpoint.parser.impl.v4.model.Node;
import com.jpoint.parser.impl.v4.model.Tree;

import java.util.ArrayList;
import java.util.List;


public class InnParserV4 implements InnParser {
    private final ResultConverter resultConverter;

    public InnParserV4(ResultConverter resultConverter) {
        this.resultConverter = resultConverter;
    }

    @Override
    public Integer parse(InnData inn) {
        List<Integer> result = new ArrayList<>();
        final Tree tree = TreeBuilder.build(inn);
        for (int i = 1; i <= INN_SIZE; i++) {
            result.add(getByPosition(i, tree));
        }
        return resultConverter.convert(result); // can be counted during the for
    }

    private Integer getByPosition(int i, Tree tree) {
        Node head = tree.getHead();
        while (head.getNumber() == null) { // min 2 max 5
            head = head.getNext(i, head);
        }
        return head.getNumber();
    }
}
