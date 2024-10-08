package com.green.day02.ch04;

public class RelationalOp {
    public static void main(String[] args) {
        /*
            관계연산자 >> 결과 타입은 boolean(true/false)
         */
        int n1 = 3, n2 = 2, n3 = 7;
        float n4 = 7.0f; // literal실수는 double타입이다 float에 저장하고싶다면 뒤에 f || F를 붙여야한다.
        float n6 = 7;
        System.out.printf("%f %f", n4, n6);
        //리터럴 실수 뒤에 d, D를 붙여도 상관없다. 7.0, 7.0d, 7.0D 전부 double 타입
        double n5 = 7.0;
        // 아래 n7, n8은 같은 이유로 자동 형변환이 되지 않는다.
        // float n7 = 7.0d;
        // float n8 = n5;
    }
}
