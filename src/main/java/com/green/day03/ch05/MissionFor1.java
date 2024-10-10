package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        /*
            1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성
         */
        int mul = 1;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            mul *= i;
            System.out.printf("%,d\n", mul);
            sum += mul;
        }
        System.out.printf("결과는 %,d\n", mul);
        System.out.printf("곱의 합은 %,d\n", sum);
    }
}
