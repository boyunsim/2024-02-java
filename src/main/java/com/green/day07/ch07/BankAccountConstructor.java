package com.green.day07.ch07;

class BankAccount2 {
    private String accNumber; //계좌번호
    private String ssNumber; //주민번호
    private int balance;

    /*
        생성자는 메소드의 한 종류
        정의했을 때 메소드와 다른점 2가지
        1. 이름이 클래스명과 같다.
        2. 반환형(리턴타입: void, int ...)을 작성하지 않는다.

        생성자의 특징은 오로지 객체 생성할때만 호출할 수 있다.
        객체생성 이후에는 호출 불가

        생성자를 작성하지 않으면 기본생성자가 자동으로 만들어진다.
        하지만 생성자를 하나라도 작성을 하게되면 기본 생성자를 자동으로 만들어주지 않는다.
        그럴땐 기본 생성자를 만들어줘야 한다.

        오버로딩(Overloading): 같은 이름의 메소드를 여러개 만들 수 있는 기법,
                              (파라미터가 다르면 가능)
     */
    //기본생성자의 모습
    BankAccount2() {
        super(); //생략 가능
    }
    BankAccount2(String acc, String ss, int bal) {
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

public class BankAccountConstructor {
    public static void main(String[] args) {
        /*
            객체 생성된 new 키워드 우측에 적는 것은 생성자 호출이다.
            모든 객체지향언어는 객체를 생성할 때 생성자를 호출해야 한다.
         */
        BankAccount2 ba1 = new BankAccount2("12-34-89", "990909-9090990", 10000); //파라미터가 있는 생성자 호출 || 오버로딩된 생성자 호출

        BankAccount2 ba2 = new BankAccount2("33-55-09", "770808-5959007", 20000);

        BankAccount2 ba3 = new BankAccount2(); //기본생성자 호출

        ba1.checkMyBalance();
        ba2.checkMyBalance();
        ba3.checkMyBalance();

    }
}
