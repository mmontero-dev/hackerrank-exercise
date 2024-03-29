package com.hackerrank.string.exercise02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Solution Test Java Substring")
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
        String inputString = "Helloworld\n3 7\n";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "lowo\n";
        assertEquals(outPut, outContent.toString());
    }
}
