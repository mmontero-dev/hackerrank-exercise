package com.hackerrank.introduction.exercise10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        in.close();

        String s = String.valueOf(n);
        if(100 < n || -100 > n){
            s = String.valueOf(n + 1);
        }

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
