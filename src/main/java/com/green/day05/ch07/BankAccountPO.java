package com.green.day05.ch07;

public class BankAccountPO {
    static int balance = 0; //static 전역변수
    // 보통 static 이 아닌 private로 '은닉화' 한다.
    // 전역변수는 메소드를 통해서만 변경 확인 가능하게 한다.
    public static int deposit(int amount) {
        balance += amount; //전역변수의 값을 메소드를 통해 변경할 수 있다.
        return balance; //전역변수의 값을 리턴할 수도 있다
    }
    static int withdraw (int amount) {
        balance -= amount;
        return balance;
    }

    static int checkMyBalance() {
        //쓰레기 코드 이렇게 짜면 안됨 메소드는 한가지 일만 해야함 근데 얘는 2가지 일을 하는중
        System.out.println("잔액 : " + balance);
        return balance;
    }
}


