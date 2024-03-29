package com.hackerrank.string.exercise01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Solution Test Java Strings Introduction")
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
        String inputString = "hello\njava\n";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "9\nNo\nHello Java\n";
        assertEquals(outPut, outContent.toString());
    }

    @Test
    void testMain1() {
        String inputString = "h\njava\n";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "5\nNo\nH Java\n";
        assertEquals(outPut, outContent.toString());
    }

    @Test
    void testMain2() {
        String inputString = "hello\nj\n";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "6\nNo\nHello J\n";
        assertEquals(outPut, outContent.toString());
    }

    @Test
    void testMain3() {
        String inputString = "java\nhello\n";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "9\nYes\nJava Hello\n";
        assertEquals(outPut, outContent.toString());
    }

    @Test
    void testMain4() {
        String inputString = "javA\nhello\n";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "9\nYes\nJavA Hello\n";
        assertEquals(outPut, outContent.toString());
    }
}
