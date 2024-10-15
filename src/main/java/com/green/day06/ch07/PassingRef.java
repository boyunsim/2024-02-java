package com.green.day06.ch07;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.deposit(2000);

        BankAccount ba2 = ba;
        ba2.checkMyAllBalance();
        ba.checkMyBalance();

        ba2 = null; // null의 의미는 아무런 객체를 가르키고 있지 않다. >> Shallow copy 해제
        // ba2 = new BankAccount(); //새롭게 주소값 저장할 수 있다. 왜? 변수이기 때문에
        // ba2.checkMyAllBalance(); // null인 상태에서는 메소드 호출 X >> null 체크 필요
        if(ba2 != null) {
            ba2.checkMyBalance();
        }

        //PassingRef pf = new PassingRef();
        //pf.check(ba);  //만약 check 메소드에 static이 붙어 있지 않고 이를 사용하려면 무조건 객체화를 해야한다.
        check(ba); // >> 다이렉트로 사용하기 때문에 "static 메소드"

        //1. void, return
        //2. static, non-static
    }

    static void check(BankAccount ba) {
        ba.checkMyBalance();
    }
}
