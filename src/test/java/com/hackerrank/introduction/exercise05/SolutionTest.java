package com.hackerrank.introduction.exercise05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Solution Test Java Loops I")
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
    void testMain() throws IOException {
        String inputString = "2";
        ByteArrayInputStream inputStreamContent = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStreamContent);
        Solution.main(new String[]{});
        String outPut = "2 x 1 = 2\n2 x 2 = 4\n2 x 3 = 6\n" +
                "2 x 4 = 8\n2 x 5 = 10\n2 x 6 = 12\n" +
                "2 x 7 = 14\n2 x 8 = 16\n2 x 9 = 18\n" +
                "2 x 10 = 20\n";
        assertEquals(outPut, outContent.toString());
    }

}
