package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);
        String str = new String();
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        //레퍼런스 변수끼리의 == 비교는 주소값 비교 (동일성 비교)
        //false >> n1, n2는 각각 객체생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다르다
        //즉 2개의 NumBox객체가 만들어졌다.
        System.out.println("n1 == n2: " + (n1 == n2));
        System.out.println("n1.equals(n2): " + n1.equals(n2));
    }
}
class NumBox {
    private int num;

    NumBox(int num) {
        this.num = num;
    }

    int checkNum() {
        return num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
        // 메소드: ()소괄호가 보이기 때문에
        // static 메소드
        // 리턴타입이 String (비void 메소드이다)
    }

    @Override
    public boolean equals(Object object) {
//        return ((NumBox)object).num == this.num;
        String str = object.toString();
        return String.valueOf(this.num).equals(str);
    }
}
