package com.green.day08.ch13;

public class ArrayIsInstance {
    public static void main(String[] args) {
        //길이가 5인 int형 1차원 배열의 생성
        int[] ar1 = new int[5];

        //길이가 7인 double형 1차원 배열의 생성
        double[] ar2 = new double[7];

        float[] ar3;
        ar3 = new float[9];

        Integer i = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        i2 = i2 + 2;

        //Integer i3 = new Integer(10);
        //Integer i4 = new Integer(10);
        //System.out.printf("i3 == i4 : %b\n",i3==i4);

        Integer i5 = Integer.valueOf(12);
        System.out.printf("i2 == i5 : %b\n",i2==i5); //single tone 처럼 작동

        System.out.println(i == i2);

        System.out.println("ar1.length : " + ar1.length);
        System.out.println("ar2.length : " + ar2.length);
        System.out.println("ar3.length : " + ar3.length);
    }
}
