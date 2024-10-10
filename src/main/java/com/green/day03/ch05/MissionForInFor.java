package com.green.day03.ch05;

import java.util.Scanner;

public class MissionForInFor {
    public static void main(String[] args) {
        /*
            중첩 for 문을 이용하여 구구단

            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            ...
            2 x 9 = 18
            (개행)
            3 x 1 = 3
            3 x 2 = 6
            ...
            9 x 9 = 81
         */
        System.out.println("-----------");
        for (int i=1; i<=9; i++) {
            for (int n=1; n<=9; n++){
                System.out.printf("%d X %d = %d\n", i, n, (i*n));
            }
            System.out.println("-----------");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("1~9 중 입력하시오. ");
        int dan = scan.nextInt();
        System.out.println("-----------");
        for (int i=1; i<=9; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, i * dan);
        }
        System.out.println("-----------");
    }
}
