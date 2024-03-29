package com.hackerrank.introduction.exercise08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String format = "%d %s\n";

        int line = 1;
        do {
            System.out.printf(format,line, sc.nextLine());
            line++;
        } while (sc.hasNext());
    }
}