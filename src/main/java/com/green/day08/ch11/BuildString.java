package com.green.day08.ch11;

public class BuildString {
    public static void main(String[] args) {
        //문자열 "123"이 저장된 인스턴스 생성
        StringBuilder sb = new StringBuilder("123");
        sb.append(45678);
        System.out.println("sb: " + sb);

        sb.delete(0, 2);
        System.out.println("sb: " + sb);

        //미니 미션
        //모든 문자열을 지우는 방법(치사하게 x)

        System.out.println(sb.length());
        sb.delete(0, sb.length());
        System.out.println(sb.length());

        sb.append(345678);
        System.out.println("sb: " + sb);

        sb.replace(0, 3, "AB");
        String str = sb.toString(); //StringBuilder에서 String타입으로 변경
        System.out.println("sb: " + sb);
        System.out.println("str: " + str);

        sb.reverse();
        System.out.println("sb: " + sb);

        StringBuilder sb2 = sb.reverse().replace(0, 2, "KK");
        // 체이닝 기법, return this;가 핵심이다.

        String sub = sb.substring(2, 4);
        System.out.println(sub);
    }
}

