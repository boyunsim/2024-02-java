package com.green.day11.ch16;

public class OverridingToString {
    public static void main(String[] args) {
        Cake c = new Cake();
        System.out.println(c);
        CheezeCake cc = new CheezeCake();
        System.out.println(cc);

        Cake c2 = cc;
        System.out.println(c2); //실행이 된다면 cc 나 c2나 똑같다.

        System.out.println(c2==cc); //true >> 같은 주소값이다
    }
}

class Cake extends Object{
    @Override
    public String toString() {
        return "My birthday cake";
    }

    final void blowCandle() { // final을 붙이면 오버라이딩 금지❗❗❗❗❗
        System.out.println("초를 분다.");
    }
}
//클래스 앞에 final 키워드가 있으면 상속 금지
//대표적으로 String 클래스는 상속이 불가능
final class CheezeCake extends Cake {
    @Override //아래의 메소드명이 부모와 다르다면 빨간줄이 뜨므로 실수를 방지할 수 있다.
    public String toString(){
        return "My birthday cheeze cake";
    }

    //자식에서 blowCandle 오버라이딩을 할 수 없다.
    //부모메소드에 final키워드가 있기 때문
//    final void blowCandle() { // final을 붙이면 오버라이딩 금지❗❗❗❗❗
//        System.out.println("초를 분다.");
//    }
}

//상속을 받을 수 없다.
//class chocoCheezeCake extends CheezeCake {
//
//}