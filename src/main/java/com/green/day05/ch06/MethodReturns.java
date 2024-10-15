package com.green.day05.ch06;

public class MethodReturns {
    public static void main(String[] args) {
        int result;
        int n1 = 4, n2 = 5;
        result = adder(n1, n2); // 더한값을 리턴 9
        System.out.printf("%d + %d = %d\n",n1, n2, result);
        System.out.printf("%.1f x %.1f = %.2f\n", 3.5, 3.5, square(3.5f));
        System.out.println(square(6));
        System.out.println(square(4.5f));
    }
    static int adder(int n1, int n2) {
        //      int r = n1 + n2;
        //      return r;
        return n1 + n2;
    }
    static double square(double n) {
        return n * n;
    }
    static float square(float n) {
        return n * n;
    }
}
