package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS(); //SubCLS의 기본생성자에 super();로 count++; 한번더 실행되어 3!
        sub1.showCount();
    }
}

class SuperCLS {
    protected static int count;

    SuperCLS() {
        count++;
    }
}

class SubCLS extends SuperCLS {
    void showCount() {
        System.out.println("count: " + count);
    }
}

