package com.green.day08.ch13;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i=0; i<arr.length; i++) {
//            if (i==0) {
//                arr[i] = 10;
//            } else {
//                arr[i] = arr[i-1] + 10;
//            }
            arr[i] = 10*(i+1);

        }
        //      코드 조심
        //건드리지 마시오. 뭅니다
        for (int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
    }
}
