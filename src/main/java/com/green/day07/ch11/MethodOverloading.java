package com.green.day07.ch11;

public class MethodOverloading {
    /*
        오버로딩은 메소드에서만 적용된다.
        오버로딩은 같은 이름의 메소드를 여러개 정의할 수 있는 기법
        매개변수의 종류 및 타입이 다르다면 가능하다.
        (같은 이름의 다른 메소드와 매개변수 구분이 된다면)

        매개변수명과 리턴타입은 전혀 상관이 없다.
        오로지 매개변수 타입의 개수와 순서로 구분

        생성자도 메소드의 한 종류기 때문에 오버로딩이 된다.
     */

    public void sum(int n1){}
    public void sum(int n1, int n2){} //매개변수 개수로 구분
    //public void sum(int n2, int n1){} //매개변수명으로 구분 불가
    //public String sum(int n1, int n2){return "String";} //리턴타입으로 구분 불가
    public void sum(String str, int n1){}
    public void sum(int n1, String str){} //매개변수 순서로 구분
}
