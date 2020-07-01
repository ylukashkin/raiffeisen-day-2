package com.jpoint.parser.impl.v1;

import com.jpoint.parser.InnParser;
import com.jpoint.parser.common.impl.ExtractNumberImpl;
import com.jpoint.parser.common.impl.ResultConverterImpl;
import com.jpoint.parser.data.TestData;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InnParserV1Test {

    private InnParser testSubject;

    @Before
    public void init() {
        testSubject = new InnParserV1(new ExtractNumberImpl(), new ResultConverterImpl());
    }

    @Test
    public void testBasicResultsForExtractToStrings() {
        // when
        Integer result1 = testSubject.parse(TestData.FIRST_EXAMPLE);
        Integer result2 = testSubject.parse(TestData.SECOND_EXAMPLE);
        Integer result3 = testSubject.parse(TestData.THIRD_EXAMPLE);

        // then
        assertThat(result1, is(TestData.FIRST_RESULT));
        assertThat(result2, is(TestData.SECOND_RESULT));
        assertThat(result3, is(TestData.THIRD_RESULT));
    }
}
