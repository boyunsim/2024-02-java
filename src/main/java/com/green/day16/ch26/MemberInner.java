package com.green.day16.ch26;

import com.green.day01.ch01.SystemOutPrintLn;

//p.646
public class MemberInner {
    public static void main(String[] args) {
        Outer2 o1 = new Outer2();
        Outer2 o2 = new Outer2();

        Outer2.Member o1m1 = o1.new Member(); // 적어도 강사님은 실무에서 보신적 없음.
        Outer2.Member o2m2 = o2.new Member(); // 적어도 강사님은 실무에서 보신적 없음.

        o1m1.add(10);
        o2m2.add(30);

        System.out.println(o1m1.get());
        System.out.println(o1.parentGet());
        System.out.println("---------------");
        System.out.println(o2m2.get());
        System.out.println(o2.parentGet());
    }
}

class Outer2 {
    private int num;

    class Member {
        void add(int val) {
            num += val;
        }
        int get() {
            return num;
        }
    }

    int parentGet() {
        return num;
    }
}