package com.green.day04.ch06;

import java.util.Scanner;

public class MethodStudy {
    /*
        아래 메소드를 main 메소드라고 부른다.
        메소드를 만드는 행위는 '메소드를 정의했다.'라고 일컫는다.
        만든 메소드를 사용하는 행위를 '메소드를 호출했다.'라고 일컫는다
        public, static은 나중에 설명

        아래 4가지가 메소드 구성요소
        void : 리턴 타입                     >> 메소드가 호출된 후 결과값
        main : 메소드명                      >> 호출할 때 사용
        (String[] args) : 파라미터, 매개변수  >> 메소드를 호출 할 때 메소드에 보내는 데이터
        (리턴타입 + 메소드명 + 파라미터): 선언부
        {} : 구현부                         >> 호출되었을 때 실행되는 부분

        메소드를 크게 두 분류
        - void 메소드 >> 리턴하는 값이 없다. (결과값이 없다.) 실행커서가 단독으로 호출한 곳으로 돌아간다.
        - return 메소드(비void) >> 리턴하는 값이 있다. (결과값이 있다.)
     */
    public static void main(String[] args) { // args는 arguments의 줄임말
        Scanner scan = new Scanner(System.in);
        System.out.print("정수1을 입력하세요 : ");
        int num1 = scan.nextInt();
        System.out.print("정수2을 입력하세요 : ");
        int num2 = scan.nextInt();
        sum(num1, num2);
        sum(5, 7); // sum 메소드를 호출했다, 정확히는 MethodStudy.sum();으로 해야한다. 메소드에 보내는 값은 아규먼트(인자)
        int result = returnsum(5, 7);
        System.out.printf("result = %d\n", result);
        System.out.println("result2: " + returnsum(5, 7));
        System.out.println("result2: " + 12);
    }

    //sum이라는 이름의 static 메소드를 정의(파라미터 2개)
    static void sum(int n1, int n2){
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
        //return; 생략됨
    }
    static int returnsum(int n1, int n2) {
        return n1 + n2;
    }

}
