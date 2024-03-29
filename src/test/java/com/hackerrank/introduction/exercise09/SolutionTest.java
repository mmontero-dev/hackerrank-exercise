package com.hackerrank.introduction.exercise09;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Solution Test Java Static Initializer Block")
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
        String inputString = "hello\n3";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "java.lang.Exception: Breadth and height must be positive\n";
        assertEquals(outPut, outContent.toString());
    }

    //TODO disable test with code static in class
    @Disabled
    @Test
    void testMain1() {
        String inputString = "1\n3";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "3\n";
        assertEquals(outPut, outContent.toString());
    }

    @Test
    void testMain2() {
        String inputString = "-1\n2";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "java.lang.Exception: Breadth and height must be positive\n";
        assertEquals(outPut, outContent.toString());
    }

    @Test
    void testMain3() {
        String inputString = "-1000\n2";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "java.lang.Exception: Breadth and height must be positive\n";
        assertEquals(outPut, outContent.toString());
    }

    @Test
    void testMain4() {
        String inputString = "1\n-2";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "java.lang.Exception: Breadth and height must be positive\n";
        assertEquals(outPut, outContent.toString());
    }

    @Test
    void testMain5() {
        String inputString = "1\n-2000";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "java.lang.Exception: Breadth and height must be positive\n";
        assertEquals(outPut, outContent.toString());
    }

}
