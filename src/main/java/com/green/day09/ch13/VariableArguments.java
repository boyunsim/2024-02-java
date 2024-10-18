package com.green.day09.ch13;

//가변 인수 (가변 인자) 가변인자는 웹개발자 들이 잘 쓰지 않는다.
public class VariableArguments {
    public static void main(String[] args) {
        sum(1, 2); //3
        //sum메소드 호출 아규먼트 정수값 2개를 보내고 있다.
        //void 메소드(혼자 있음)
        //클래스 메소드 vs 인스턴스 메소드 : 객체 생성 부분이 없기 때문에 클래스 메소드(static)

        sum(10, 22, 33);

        sumVar(1);
        sumVar(1, 2);
        sumVar(1, 12, 3);
        sumVar(4, 1, 2, 3, 1, 2, 3);
    }

    static void sumVar(int... values) { //values >> 배열이 되어서 들어온다.
        int sum=0;
        for (int i = 0; i<values.length; i++) {
            sum += values[i];
        }
        System.out.println("합계: " + sum);
    }

    static void sum(int n1, int n2) {
        System.out.println(n1+n2);
    }
    static void sum(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }
}
