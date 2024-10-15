package com.green.day05.ch06;

public class Method2Param {
    public static void main(String[] args) {
        double myHeight = 175.9;
        hiEveryone(12, 12.5);
        /*
        제 나이는 12세 입니다.
        저의 키는 12.5cm 입니다.
         */
        hiEveryone(13, myHeight);
        /*
        제 나이는 13세 입니다.
        저의 키는 175.9cm 입니다.
         */
        byEveryone();
        byEveryone();
        //다음에 뵙겠습니다.
    }

    static void hiEveryone(int a, double h) {
        System.out.printf("제 나이는 %5d세 입니다.\n저의 키는 %5.1fcm 입니다.\n", a, h);
    }

    static void byEveryone() { //메소드뒤 () '소괄호' >> 공장입구이다!!!
        System.out.println("다음에 뵙겠습니다.\n");
    }
}
