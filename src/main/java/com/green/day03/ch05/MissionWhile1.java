package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {
        /*
            while문을 활용하여 1~99까지의 합을 구하는 프로그램을 작성하시오.
            result = 4950
         */

        int n = 1;
        int sum = 0;

        while(n < 100) {
            sum += n++;
        }
        System.out.printf("result = %d\n", sum);
    }
}
