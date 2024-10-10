package com.green.day03.ch05;

public class InfinityLoop {
    public static void main(String[] args) {
        int n = 1;
        while (true) {
            if ((n % 3) == 0 && (n % 14) == 0){
                System.out.printf("n: %d\n", n);
            }
            if (n == 100) {
                break;
            }
            n++;
        }
        System.out.printf("n: %d\n", n);
    }
}
