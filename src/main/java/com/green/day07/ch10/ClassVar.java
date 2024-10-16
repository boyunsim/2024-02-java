package com.green.day07.ch10;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt ic1 = new InstCnt();
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
    }
}

class InstCnt {
    static int instNum; //메모리에서 홀로 다른 공간 하나를 쓴다
    int value;
    InstCnt() {
        instNum++;
        value++;
        System.out.println("인스턴스 생성: " + InstCnt.instNum); //InstCnt 는 생략가능
        System.out.println("인스턴스 생성: " + instNum);
        System.out.println("value: " + value);
    }
}


