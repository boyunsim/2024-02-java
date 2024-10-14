package com.green.day05.ch07;

public class BankAccountPoTest {
    public static void main(String[] args) {
        System.out.println("balance = " + BankAccountPO.balance);
        int deposit = BankAccountPO.deposit(1000);
        System.out.println("balance = " + deposit);
        deposit = BankAccountPO.deposit(1000);
        System.out.println("balance = " + deposit);
        deposit = BankAccountPO.deposit(1000);
        System.out.println("balance = " + deposit);
        deposit = BankAccountPO.withdraw(2000);
        System.out.println("balance = " + deposit);
        deposit = BankAccountPO.checkMyBalance();
        System.out.println("잔액2 : " + deposit);
    }
}
