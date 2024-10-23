package com.green.day11.ch14;

public class SuperSubStatic { //파일명과 클래스명이 같을 때만 public을 붙일수있다.
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS(); //SubCLS의 기본생성자에 super();로 count++; 한번더 실행되어 3!
        sub1.showCount();
    }
}

class SuperCLS { //클래스 앞에는 public만 올 수 있다 protected나 private은 올 수 없다
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

