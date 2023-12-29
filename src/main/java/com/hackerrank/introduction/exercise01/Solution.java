package com.hackerrank.introduction.exercise01;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    public static void main(String[] args) {
        System.setOut(new PrintStream(outContent));

        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");

        assertEquals("Hello, World.\nHello, Java.\n", outContent.toString());

        System.setOut(originalOut);

    }
}
