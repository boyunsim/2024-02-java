package com.green.day07.ch07;

class BankAccount {
    private String accNumber; //계좌번호
    private String ssNumber; //주민번호
    private int balance;

    void initAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkMyBalance() {
        System.out.printf("계좌번호: %s\n", accNumber);
        System.out.printf("주민번호: %s\n", ssNumber);
        System.out.printf("계좌잔액: %,d\n", balance);
    }
}

public class BankAccountUniID {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(); //원래는 getters-setters 를 통해 멤버필드를 초기화했지만 이렇게 초기화가능 >> 생성자로 바꾸려한다
        ba1.initAccount("12-34-89", "990909-9090990", 10000);

        BankAccount ba2 = new BankAccount();
        ba2.initAccount("33-55-09", "770808-5959007", 20000);

        ba1.checkMyBalance();
        ba2.checkMyBalance();

    }
}
