package com.green.day04.ch06;

public class MethodLogicalOp {
    public static void main(String[] args) {
        int n1 = 113;
        boolean b = loicalOp1(n1);
        System.out.printf("b: %b\n",b);
        boolean b2 = logicalOp2(n1);
        System.out.printf("b2: %b\n",b2);
        //값이 1이상 100이하라면 true, 아니면 false
    }
    static boolean loicalOp1(int n) {
        return (1 <= n && n <= 100);
    }
    static boolean logicalOp2(int n) {
        return (n % 3 == 0 || n % 2 == 0);
    }
}
