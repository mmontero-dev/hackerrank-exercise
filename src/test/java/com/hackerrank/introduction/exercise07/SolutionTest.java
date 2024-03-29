package com.hackerrank.introduction.exercise07;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Solution Test Java Datatypes")
public class SolutionTest {

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
    void testMain() {
        String inputString = "5\n-150\n150000\n1500000000\n213333333333333333333333333333333333\n-100000000000000";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "-150 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "150000 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "1500000000 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "213333333333333333333333333333333333 can't be fitted anywhere.\n" +
                "-100000000000000 can be fitted in:\n" +
                "* long\n";
        assertEquals(outPut, outContent.toString());
    }

}
