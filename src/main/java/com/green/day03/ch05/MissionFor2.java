package com.green.day03.ch05;

import java.util.Scanner;

public class MissionFor2 {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++) {
            for (int n=1; n<=9; n++){
                System.out.printf("%d X %d = %d\n", i, n, (i*n));
            }
            System.out.println("-----------------");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("1~9 중 입력하시오. ");
        int dan = scan.nextInt(); //매직 넘버
        for (int i=1; i<=9; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, i * dan);
        }
            System.out.println("-----------------");
    }
}
