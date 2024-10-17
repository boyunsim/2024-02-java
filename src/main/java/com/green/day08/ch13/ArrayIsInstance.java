package com.green.day08.ch13;

public class ArrayIsInstance {
    public static void main(String[] args) {
        //길이가 5인 int형 1차원 배열의 생성
        int[] ar1 = new int[5];

        //길이가 7인 double형 1차원 배열의 생성
        double[] ar2 = new double[7];

        float[] ar3;
        ar3 = new float[9];

        System.out.println("ar1.length : " + ar1.length);
        System.out.println("ar2.length : " + ar2.length);
        System.out.println("ar3.length : " + ar3.length);
    }
}
