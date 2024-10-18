package com.green.day09.ch13;

import java.util.Arrays;

public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {3,10,66,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(MyArrays.toString(arr));
        System.out.println(MyArrays.toString2(arr));
        System.out.println(MyArrays.toString3(arr));

        int[] arr2 = Arrays.copyOf(arr, 2);
        System.out.println(arr == arr2);
        System.out.println(MyArrays.toString(arr2));
        System.out.println("-----------------------");
        int[] arr3 = MyArrays.copyOf(arr);
        int[] arr4 = MyArrays.copyOf(arr,2);
        int[] arr5 = MyArrays.copyOf(arr,3);
        int[] arr6 = MyArrays.copyOf(arr,4);
        int[] arr12 = MyArrays.copyOf(arr,12);
        System.out.println(arr == arr3);
        System.out.println(MyArrays.toString(arr3));
        System.out.println(arr == arr4);
        System.out.println(MyArrays.toString(arr4));
        System.out.println(MyArrays.toString(arr5));
        System.out.println(MyArrays.toString(arr6));
        System.out.println(MyArrays.toString(arr12));
    }
}
