package com.green.day05.ch06;

public class Mission06_2_1 {
    public static void main(String[] args) {
        /*
            인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산하여 반환하는 메소드
            원의 둘레를 계산하여 변환하는 메소드를 각각 정의하고,
            이를 호출하는 메인 메소드
         */
        double r = 3124124;
        nulbi(r);
        dulle(r);
        System.out.printf("원의 넓이는 %.5f\n", nulbi(r));
        System.out.printf("원의 둘레는 %.5f\n", dulle(r));
    }
    static double nulbi(double r) {
        return Math.PI*r*r;
    }
    static double dulle(double r) {
        return 2*Math.PI*r;
    }

}
