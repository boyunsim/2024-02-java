package com.green.day05.ch07;

public class BankAccountPoTest2 {
    public static void main(String[] args) {
        BankAccountPO po1 = new BankAccountPO();
        po1.deposit(1000);
        po1.checkMyBalance();

        BankAccountPO po2 = new BankAccountPO();
        po2.checkMyBalance();
        //결론부터 말하자면 static이 붙으면 new를 붙이지 않는다.
        //(묻지도 따지지도 않고 만들어진 단 하나의 메모리에 올라가기 때문)

        //객체를 여러 개 만들 시 다른 값을 가지게 하고 싶다면 static을 절대 쓰지 않는다
        //이를 제외한 경우는 적극적으로 static을 써야한다.
        //(메모리가 넘쳐나는 현 상황이기도 하고 처리속도가 static이 더 빠르다)

        BankAccountPO.checkMyBalance(); // 객체화 없이 다이렉트로 접근 가능. 이를 위해 static을 사용한다
    }
}
