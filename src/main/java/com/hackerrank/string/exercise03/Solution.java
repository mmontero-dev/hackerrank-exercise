package com.hackerrank.string.exercise03;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] subtring = new String[(s.length() - k + 1)];

        for (int i = 0; i < s.length() - k + 1; i++) {
            subtring[i] = s.substring(i, i + k);
        }

        String temp = "";
        for (int i = 0; i < subtring.length; i++) {
            for (int x = 0; x < subtring.length; x++) {
                if (!(subtring[i].compareTo(subtring[x]) > 0)) {
                    temp = subtring[i];
                    subtring[i] = subtring[x];
                    subtring[x] = temp;
                }
            }
        }

        //System.out.println(Arrays.toString(subtring));
        smallest = subtring[0];
        largest = subtring[subtring.length - 1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}