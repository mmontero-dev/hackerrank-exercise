package com.hackerrank.introduction.exercise06;

import java.util.Scanner;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                a += b;
                if(j > 0){
                    System.out.print(" ");
                }
                System.out.print(a);
                b = b * 2;
            }
            System.out.print("\n");
        }
        in.close();
    }

}
