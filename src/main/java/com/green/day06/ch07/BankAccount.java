package com.green.day06.ch07;

import com.green.day05.ch07.BankAccountPO;

public class BankAccount { //Heap 메모리에 올라간다
    static int allbalance = 0;
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
        allbalance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
        allbalance -= amount;
    }

    void checkMyBalance() {
        System.out.printf("balance: %d\n", balance);
    }

    void checkMyAllBalance() {
        System.out.printf("all balance: %d\n", allbalance);
    }
}
