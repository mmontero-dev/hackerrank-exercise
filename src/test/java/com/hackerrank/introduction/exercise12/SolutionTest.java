package com.hackerrank.introduction.exercise12;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Solution Test Java Currency Formatter")
class SolutionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(System.in);
    }

    @Test
    void testMain0() {
        String inputString = "12324.134\n";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "US: $12,324.13\n" +
                "India: ₹ 12,324.13\n" +
                "China: ￥12,324.13\n" +
                "France: 12 324,13 €\n";
        assertEquals(outPut, outContent.toString());
    }


}
