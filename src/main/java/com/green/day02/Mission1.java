package com.green.day02;

public class Mission1 {
    public static void main(String[] args) {
        //n1 / n2 나누어서 3.3333333 나올 수 있도록 해주세요

        int n1 = 10;
        int n2 = 3;

        System.out.println(n1/n2);
        //int / int 결과타입도 int 이기 때문에 실수값이 날아간다.

        float result = n1 / n2;
        System.out.println(result);
        //위와 같은 이유로 실수값이 날아가 3 값이 float 에 저장되어 3.0이 도출된다.

        float n3 = (float)n1/n2;
        System.out.printf("%f", n3);
        // float / int 에서 타입이 다르므로 자동형변환을 통해
        // float / float 으로 결과값 또한 float 이 되고 드디어 3.33333이 도출된다.
    }
}
