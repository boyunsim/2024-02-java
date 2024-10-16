package com.green.day07.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw = new AccessWay();
        aw.increseCnt();
        aw.num++;
        AccessWay.num++; // static은 객체화 하지 않고 접근하기 위해 사용한다.
        System.out.printf("num: %d\n", AccessWay.num); // 클래스명.static 변수 || 메소드, 이렇게 사용하는 것이 맞다.
        System.out.printf("num: %d\n", aw.num); // 가능은 하나 static 때문에 객체화를 하지 않기 때문에 쓸일이 없다.
    }
}

class AccessWay {
    static int num;

    AccessWay() {
        increseCnt();
    }

    void increseCnt() { //static이 붙지 않은 메소드에서도 static 멤버필드를 사용할 수 있다.
        num++;
    }
}