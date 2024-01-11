package com.hackerrank.introduction.exercise03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Solution Test Java If-Else")
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
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream("3".getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        assertEquals("Weird\n", outContent.toString());
    }

    @Test
    void testMain2() {
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream("24".getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        assertEquals("Not Weird\n", outContent.toString());
    }
}
