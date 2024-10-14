package com.green.day05.ch06;

public class Mission06_1_1 {
    public static void main(String[] args) {
        calc(10, 4);
    }
    static void calc(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
        System.out.printf("%d / %d = %.2f\n", n1, n2, (float)n1 / n2);
        System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
        System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
    }
}
