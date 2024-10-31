package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        Function<int[], Integer> fn = arr1 -> {
            int maxv = arr1[0];
            for(int i = 0; i<arr.length; i++) {
                if(maxv < arr1[i]) {
                    maxv = arr1[i];
                }
            }
            return maxv;
        };

        int maxValue = fn.apply(arr);
        System.out.println("maxValue: " + maxValue);
    }
}
