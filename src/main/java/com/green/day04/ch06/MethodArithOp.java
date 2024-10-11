package com.green.day04.ch06;

//주석처리 안되고 이상한 문자가 뜰때 (/, 역 ?) >> 문자를 클릭하고 모니터 우하단 한국어 microsoft 입력기 클릭!
public class MethodArithOp {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;
        subtract(7, 3);
        subtract(n1, n2);
        subtract(10, 2);
        multiply(n1, n2);
        float r = divide(10, 3);
        System.out.printf("r : %f\n", r);
        int r2 = modulo(10,4);
        System.out.printf("r2 : %d\n", r2);
    }
    static float divide(int n1, float n2) {
        return n1 / n2;
    }
    static void subtract(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2 ,(n1 - n2));
    }
    static void multiply(int n1, int n2) {
        System.out.printf("%d * %d = %d\n", n1, n2 ,(n1 * n2));
    }
    static void plus(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2 ,(n1 + n2));
    }
    static int modulo(int n1, int n2) {
        return n1 % n2;
    }
}
