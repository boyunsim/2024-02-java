package com.green.day16.ch26;
//p.643
public class StaticNested {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Nested1 nested1 = new Outer.Nested1(); // nested class의 객체화는 클래스명.클래스명으로 한다
        nested1.add(10);
        nested1.add(2);

        Outer.Nested2 nested2 = new Outer.Nested2();
        System.out.println(nested2.get());
        System.out.println(Outer.getNum());

    }
}

class Outer {
    private static int num;

    public static int getNum() {
        return num;
    }

    //static nested class >> 사용이 드물다
    static class Nested1 {
        void add(int val) {
            num += val;
        }
    }

    static class Nested2 {
        int get() { return num; }
    }
}
