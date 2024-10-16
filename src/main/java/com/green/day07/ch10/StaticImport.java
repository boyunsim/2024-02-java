package com.green.day07.ch10;

import static java.lang.Math.*; // it쪽에서 *의 의미는 all, everything
//Math 클래스 아래에 있는 static 멤버필드, 멤버메소드 전부 import하라는 의미
//import static java.lang.Math.E;
//import static java.lang.Math.random(); >> 원래는 두개 적는데 *로 전부 import가능


public class StaticImport {
    public static void main(String[] args) {
        /*
        원래는 아래처럼 작성을 해야하지만
        System.out.println( Math.E );
        System.out.println( Math.random() );

        static import 선언을 하면
         */
        System.out.println(E);
        System.out.println(random());
    }
}
