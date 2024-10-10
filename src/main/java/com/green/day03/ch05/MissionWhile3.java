package com.green.day03.ch05;

public class MissionWhile3 {
    public static void main(String[] args) {
        /*
            while문을 활용하여
            1000이하 자연수 중, 2의 배수이자 7의 배수인 수를 모두 출력하고,
            그 수들의 합을 구해서 출력하는 프로그램을 작성.
         */
        int n = 1;
        int sum = 0;
        int num = 0;
        int fir = 2;
        int sec = 7;
        int multi = fir*sec;
        while(n <= 1000) {
            if (n % fir == 0 && n % sec ==0) {
                System.out.println(n);
                sum += n;
                num = n/(multi);
            }
            n++;
        }
        System.out.printf("1000이하의 수 중 %d의 배수의 개수는 %d개 입니다.\n", multi, num);
        System.out.println(sum);
    }
}
