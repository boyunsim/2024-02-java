package com.green.day06.ch07;

public class Baaaaa {
    public static void main(String[] args) {
        Hiiiii.a = 10; //Hiiiii가 default이기 때문에 접근가능
        System.out.println(Hiiiii.a);
    }
}
class Hiiiii{  // java 파일명과 class명이 같을 때 public을 붙일 수 있다.
    static int a;
}
