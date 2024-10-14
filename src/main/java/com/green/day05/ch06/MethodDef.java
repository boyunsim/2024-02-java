package com.green.day05.ch06;


public class MethodDef {
    public static void main(String[] args) {
        /*
            좋은 아침입니다.(개행)
            제 나이는 n세 입니다.
         */
        System.out.println("프로그램의 시작");
        hiEveryone(12);
        hiEveryone(13);
        System.out.println("프로그램의 끝");
    }
    static void hiEveryone(int n) {
        System.out.printf("좋은 아침입니다 여러분.\n제 나이는 %d세 입니다.\n", n);
        System.out.println();
    }
}
