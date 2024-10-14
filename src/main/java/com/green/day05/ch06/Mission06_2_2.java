package com.green.day05.ch06;

public class Mission06_2_2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if (sosu(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean sosu(int n) {
        return n%2 != 0 && n%3 != 0 && n%5 != 0 && n%7 != 0
                || (double)n/2 == 1 || (double)n/3 == 1 || (double)n/5 == 1 || (double)n/7 == 1;
    }
}
