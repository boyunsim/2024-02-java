package com.green.day16.ch26;
//p.653
//익명클래스
/*
    익명 클래스는 interface를 implements한 클래스를 만들지 않고
    다이렉트로 interface를 implements한 클래스를 객체화 할 때 사용할 수 있다.
    즉, 코드 작성을 많이 생략할 수 있다.
    익명 클래스 작성보다 더 많이 생략할 수 있는게 람다식이다.
    람다식을 작성할 수 있는 interface는 오로지 추상 메소드 하나만 가지고 있는 경우만
    가능하다. >> 익명클래스와의 차이점(전부 오버라이딩 하면 되기 때문에)
    그래서 보통 람다식을 사용하는 interface는 @FunctionalInterface
    에노테이션이 붙어있다. 이 에노테이션은 2개의 추상메소드가 있으면 컴파일 에러가 발생한다.
 */
public class UseAnonymousInner {
    public static void main(String[] args) {
        //익명클래스
        Printable p = new Printable() {
            //인터페이스 객체화한게 아니다 printable을 implements한 이름없는 class를 객체화 한것이다
            @Override
            public void print() {
                System.out.println("익명클래스 print");
            }
        };

        Printable p2 = () -> {
            // 람다 기법은 익명클래스와 성능의 차이는 없고 그저 적는것을 줄이기 위해 사용하는 것
            //() : 파라미터 없다   -> : 람다식 시작한다
            System.out.println("람다 print");
        };
        /*
            () 파라미터 부분
            -> 람다식 시작부분
            {} : 중괄호 생략 가능한 경우는 명령이 한줄인 경우 생략 가능하다.
            리턴 메소드라면 return까지 생략 가능하다
         */

        Printable p3 = () -> System.out.println("더줄인 람다 print");
        // 람다식은 추상메소드 ❗❗❗❗단 하나❗❗❗❗만 가진 인터페이스에서만 사용가능 두개 이상이면 못씀
        // 람다식은 추상메소드명은 하나도 중요하지 않고 파라미터 와 리턴값만 중요하다

        p.print();
        p2.print();
        p3.print();
    }
}
//인터페이스는 객체화 불가능 >> 추상메소드를 가지기 때문에
@FunctionalInterface
interface Printable {
    void print();
    //void print2();
}