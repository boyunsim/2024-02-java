package com.green.day04.ch06;

public class MethodGugudan {
    public static void main(String[] args) {
//        gugudan(4);
//        gugudan(6);
        gugudanFromTo(5, 9);
        gugudanFromTo(2, 4);
    }
    static void gugudan(int n){
        for (int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
    }
    static void gugudanFromTo(int fr, int to) {

        for (int i=fr; i<=to; i++) {
//            for (int j=1; j<10; j++) {
//                System.out.printf("%d x %d = %d\n", i, j, (j * i));
//            }
            gugudan(i); // 위에서 만든 gugudan을 활용하면 더 나이스 하다. >> 메소드를 사용하는 이유!!!
            System.out.println("-----------");
        }
    }
}
