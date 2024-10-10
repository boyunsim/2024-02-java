package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        int count =0;
        for (int i=1; i<=9; i++) {

            for (int n=1; n<=9; n++){
                System.out.printf("%d X %d = %d\t",n , i, (i*n));
            }
            System.out.println();
        }
    }
}
