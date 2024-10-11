package com.green.day04.ch06;

public class MethodRelaionalOp {
    public static void main(String[] args) {
        int n1 = 11, n2 = 30;
        biggerNumber(n1, n2); //더 큰 값은 22입니다.
        biggerNumber(30, 11); //더 큰 값은 30입니다.
        biggerNumber(30, 30); //더 큰 값은 30입니다.
        int n3 = 11;
        if(isEquals(n1 , n3)) {
            System.out.printf("%d와 %d 값은 같습니다.\n", n1, n3);
        }
    }
    static void biggerNumber(int n, int n2) {
//        if(n - n2 < 0){
//            System.out.printf("더 큰 값은 %d 입니다\n", n2);
//        } else {
//            System.out.printf("더 큰 값은 %d 입니다\n", n);
//        }
        System.out.printf("더 큰 값은 %d입니다.\n", (n < n2 ? n2 : n) );
    }
    static boolean isEquals(int n1, int n2) {
        return n1==n2 ? true: false;
    }
}
