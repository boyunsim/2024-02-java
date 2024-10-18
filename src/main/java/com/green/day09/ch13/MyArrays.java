package com.green.day09.ch13;

public class MyArrays {
    public static String toString(int[] arr) {//비둘기 목돌아감
//        String result ="";
//        result += "[";
//
//        for(int i = 0; i < arr.length - 1; i++) {
//            result += arr[i];
//            result += ", ";
//        }
//        result += arr[arr.length - 1];
//        result += "]";
//
//        return result;  >> 복습을 꾸준히 하자
        StringBuilder sb = new StringBuilder();
        int lastIdx = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i == lastIdx) {
                break;
            }
            sb.append(", ");
        }
        return sb.insert(0,"[").append("]").toString();
    }
    public static String toString2(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length; i++) {
            if(i!= 0) {
                sb.append(", ");
            }
            sb.append(arr[i]);
        }
        return sb.insert(0,"[").append("]").toString();
    }
    public static String toString3(int[] arr) {
        if(arr.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            sb.append(", ");
            sb.append(arr[i]);
        }
        return sb.append("]").toString();

    }
    public static int[] copyOf(int[] arr) {

        return copyOf(arr, arr.length);
    }

    public static int[] copyOf(int[] arr, int a) {
        if(arr.length<a) {
            a=arr.length;
        }
        int[] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
