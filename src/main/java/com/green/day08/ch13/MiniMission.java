package com.green.day08.ch13;

import java.util.Arrays;

public class MiniMission {
    public static void main(String[] args) {
        //Box1이라는 클래스를 만들어서 객체로 만들고 그 객체들에 크기가 5인 배열을 각각 넣어달래요
        int[] a = new int[5];
        int[] b = new int[5];
        Box1 a1 = new Box1(a);
        Box1 b1 = new Box1(b);
    }
}

class Box1 {
    private int[] box1 = new int[5];
    Box1(int[] arr) {
        this.box1 = arr;
    }
}