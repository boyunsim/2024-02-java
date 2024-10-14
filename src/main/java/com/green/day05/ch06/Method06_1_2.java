package com.green.day05.ch06;

public class Method06_1_2 {
    public static void main(String[] args) {
        /*
            정수 들을 인자로 전달 받아서, 두 수의 '차의 절대값'을 계산하여
            출력하는 method와 이 메소드를 호출하는 main 메소드를 정의해 보자.
            단 메소드 호출시 전달 되는 값의 순서에 상관없이 절대값이 계산되고 출력되어야 한다.
         */
        abs(1, 5);
        abs(5, 5);
        abs(3, 5);
        abs(10, 5);
        abs(5, 10);
        abs(-5, 10);
        abs(10, -5);
    }
    static void abs(int n1, int n2) {
//        System.out.print("두 수의 차의 절대값은 ");
        System.out.printf("|%s - %s| = %d\n",n1 < 0 ?"("+n1+")": n1,n2 < 0 ?"("+n2+")": n2,
                            n1 > n2 ? n1 - n2 : n2 - n1);
//        if (n1 > n2){
//            System.out.printf("%d\n", n1 - n2);
//        } else {
//            System.out.printf("%d\n", n2 - n1);
//        }
    }
}
