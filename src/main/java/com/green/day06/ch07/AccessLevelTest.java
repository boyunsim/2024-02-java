package com.green.day06.ch07;

//import com.green.day06.ch09.Circle2;
import com.green.day06.ch09.InfoHideCircle; //다른 패키지에 있는 클래스면 import를 하여 사용한다.

public class AccessLevelTest {
    public static void main(String[] args) {
        InfoHideCircle ihc = new InfoHideCircle();
        //InfoHideCircle은 public이기 때문에 다른 패키지에서 접근 가능

        String str = "String은 워낙 자주 사용하기 때문에 자동으로 import가 된다.";

        //Circle2 c = new Circle2(); >> Circle2 는 default 이므로 패키지가 다르면 사용할 수 없다
    }
}
/*
    class 키워드 앞에 public을 붙일 수 있는 경우는
    java파일명과 class명이 일치할 때만 붙일 수 있다.
    나머지는 불가능
    1 class당 1 파일 만든다.
 */
//public class AccessLevel{
class AccessLevel{

}
