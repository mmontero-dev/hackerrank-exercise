package com.hackerrank.string.exercise04;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //String reverse = solutionOne(A);
        String reverse = solutionTwo(A);

        if(A.equalsIgnoreCase(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static String solutionOne(String a) {
        return new StringBuilder(a).reverse().toString();
    }

    private static String solutionTwo(String a) {
        StringBuilder reverse = new StringBuilder();

        for (int i = a.length(); i > 0; i--) {
            reverse.append(a, i -1, i);
        }

        return reverse.toString();
    }
}