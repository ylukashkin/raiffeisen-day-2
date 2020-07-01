package com.jpoint.parser.common.impl;

import com.jpoint.parser.common.ExtractNumber;
import com.jpoint.parser.data.TestData;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExtractNumberImplTest {

    private ExtractNumber testSubject = new ExtractNumberImpl();

    @Test
    public void testBasicResultsForExtractToStrings() {
        // when
        List<String> result1 = testSubject.extractToStrings(TestData.FIRST_EXAMPLE, 1);
        List<String> result2 = testSubject.extractToStrings(TestData.SECOND_EXAMPLE, 8);

        // then
        assertThat(result1.get(0), is("   "));
        assertThat(result1.get(1), is("  |"));
        assertThat(result1.get(2), is("  |"));
        assertThat(result2.get(0), is(" _ "));
        assertThat(result2.get(1), is("|_|"));
        assertThat(result2.get(2), is("|_|"));
    }
}
