package com.hackerrank.introduction.exercise09;

import java.util.Scanner;

public class Solution {

    static int BREADTH, HEIGHT;

    static {
        try {
            Scanner sc = new Scanner(System.in);
            BREADTH = sc.nextInt();
            HEIGHT = sc.nextInt();
            sc.close();
        } catch (Exception e){
            BREADTH = 0;
            HEIGHT = 0;
        }
    }

    public static void main(String[] args) {

        if(BREADTH <= 0  || HEIGHT <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(BREADTH * HEIGHT);
        }
    }
}