package com.hackerrank.string.exercise01;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String firstCapitalize = first.substring(0, 1).toUpperCase() + first.substring(1);
        String secondCapitalize = second.substring(0, 1).toUpperCase() + second.substring(1);
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(first.length() + second.length());

        System.out.println(first.compareTo(second) > 0 ? "Yes" : "No");

        System.out.println(firstCapitalize + " " + secondCapitalize);
        sc.close();

    }
}