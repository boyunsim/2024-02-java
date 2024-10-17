package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i<arr.length; i++) {
            arr[i]=i+1;
        }

        System.out.println(Arrays.binarySearch(arr,5));

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i<arr.length; i++) {
            int temp;
            int a = (int)(Math.random()*arr.length);
//            int b = (int)(Math.random()*arr.length);
//            temp = arr[a];
//            arr[a] = arr[b];
//            arr[b] = temp;
            if (arr[i]-1 != a){
            temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,4));
    }

}
