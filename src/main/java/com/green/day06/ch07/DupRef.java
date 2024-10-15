package com.green.day06.ch07;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = ba1; // 객체의 주소값 복사 하여 ba1 과 ba2의 주소값이 같다. (Shallow Copy : 얕은 복사)

        ba1.deposit(1000);
        ba2.withdraw(500);

        ba2.checkMyBalance(); // 주소값이 같기 때문에 1000이 출력된다.
    }
}
