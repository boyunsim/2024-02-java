package com.green.day07.ch10;

import java.io.PrintStream;

public class SystemOutPrintln {
    public static void main(String[] args) {
        //System.abc.kkk().ggg

        //System.abc 의 결과물을 "A"라 지칭하면
        //A.kkk().ggg

        //A.kkk().ggg 의 결과물을 "B"라 지칭하면
        //B.ggg

        //System: 클래스
        //abc: 멤버필드, 레퍼런스 변수
        //kkk(): abc가 가리키고 있는 객체의 메소드, 리턴타입(참조) 메소드 >> void 메소드라면 뒤에 .ggg가 올수 없다
        //ggg: kkk()메소드가 리턴하는 객체의 멤버필드
        System.out.println();

        PrintStream fff = System.out; // PrintStream fff >> PrintStream 객체의 주소값을 담는 레퍼런스 변수 fff
        fff.println();
        // System.out.

        //System: 클래스
        //out: static final 멤버필드, PrintStream 객체의 주소값만 담을 수 있다.
        //println(): 메소드

        /*
            PrintStream은 println(int i), println(char c), println(String str)등의
            메소드를 가지고 있고 이것은 오버로딩이다.
            만약 오버로딩이 없다면
            printlnInt(int i), printlnChar(char c), printlnString(String str)
            이런식으로 메소드를 만들어야만 한다.

         */
    }
}
