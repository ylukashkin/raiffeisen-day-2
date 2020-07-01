package com.jpoint.parser.common.impl;

import com.jpoint.parser.common.ResultConverter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ResultConverterImplTest {

    private ResultConverter testSubject = new ResultConverterImpl();

    @Test
    public void testBasicResults() {
        // give0
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numbers2 = Arrays.asList(0, 2, 3, 0, 5, 6, 7, 8, 9);
        List<Integer> numbers3 = Arrays.asList(8, 2, 3, 8, 5, 6, 9, 8, 9);

        // when
        Integer result1 = testSubject.convert(numbers1);
        Integer result2 = testSubject.convert(numbers2);
        Integer result3 = testSubject.convert(numbers3);

        // then
        assertThat(result1, is(123456789));
        assertThat(result2, is(23056789));
        assertThat(result3, is(823856989));
    }
}
