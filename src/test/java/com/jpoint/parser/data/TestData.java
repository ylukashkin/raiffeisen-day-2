package com.jpoint.parser.data;

import com.jpoint.parser.common.model.InnData;

public class TestData {

    public static final InnData FIRST_EXAMPLE = new InnData(
            "    _  _     _  _  _  _  _ \n",
            "  | _| _||_||_ |_   ||_||_|\n",
            "  ||_  _|  | _||_|  ||_| _|\n"
    );
    public static final Integer FIRST_RESULT = 123456789;

    public static final InnData SECOND_EXAMPLE = new InnData(
            " _  _  _  _  _  _  _  _  _ \n",
            "| | _| _|| ||_ |_   ||_||_|\n",
            "|_||_  _||_| _||_|  ||_| _|\n"
    );
    public static final Integer SECOND_RESULT = 23056789;

    public static final InnData THIRD_EXAMPLE = new InnData(
            " _  _  _  _  _  _  _  _  _ \n",
            "|_| _| _||_||_ |_ |_||_||_|\n",
            "|_||_  _||_| _||_| _||_| _|\n"
    );
    public static final Integer THIRD_RESULT = 823856989;
}
