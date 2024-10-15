package com.green.day06.ch07;

public class BankAccountTest {
    public static void main(String[] args) {

        // BankAccount.deposit(4000);
        BankAccount ba = new BankAccount(); // 객체 생성. //주소값이 저장.
        // ba는 BankAccount 객체 주소값만 담을 수 있는 참조변수(reference변수)이다.
        // (메모리에 올리기위함)new 키워드로 문서한테 진짜가 되라는 객체화과정 >>이 과정에서 객체의 주소값을 리턴해 저장 한다.
        // 다만 BankAccount(객체)의 주소값만 저장이 가능하다.
        ba.deposit(1000);
        ba.checkMyBalance();
        ba.deposit(2000);
        ba.checkMyBalance();
        System.out.println();

        BankAccount ba3 = new BankAccount();
        ba3.checkMyBalance(); //balance: ??
        ba3.deposit(40000);
        ba3.withdraw(1000);
        ba3.checkMyBalance(); //balance: 39000
        System.out.println();

        ba.checkMyBalance();
        ba.checkMyAllBalance();
        //static에서는 new를 쓰지 않았다 >> 이때는 객체가 아니다 객체는 "주소값". 으로 접근해야한다

        // BankAccount ba2 = new String("안녕"); //ba2는 String객체 주소값을 담을 수 없다.
        String str = new String("안녕못한다");
    }
}