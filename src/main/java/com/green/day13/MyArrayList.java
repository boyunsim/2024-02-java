package com.green.day13;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        clear();

    }

    public void add(int n, int n2) {
        int [] tmp = new int[arr.length + 1];
        for (int i = 0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
        for (int i = arr.length-2; i>=n; i--) {
            arr[i+1] = arr[i];
        }
        arr[n] = n2;
    }
    public void add(int n) {
        int [] tmp = new int[arr.length + 1];
        tmp[arr.length] = n;
        for (int i = 0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
        //arr[arr.length-1] = n;

    }

    public int remove() {
        int [] tmp = new int[arr.length-1];
        for (int i = 0; i<tmp.length; i++) {
            tmp[i] = arr[i];
        }
        int last = arr[tmp.length];
        arr = tmp;
        return last;
    }

    public int remove(int n) {
        int [] tmp = new int[arr.length - 1];
        for (int i = 0; i<arr.length; i++) {

            if (i>=n+1){
                tmp[i-1] = arr[i];
            } else {
                tmp[i] = arr[i];
            }

        }
        int last = arr[n];
        arr = tmp;
        return last;
    }

    public void remove(int n, int n2) {
        int [] tmp = new int[arr.length - (n2-n+1)];
        for (int i = 0; i<arr.length; i++) {
            if (i>=n2+1){
                tmp[i-(n2-n+1)] = arr[i];
            } else if(i < n){
                tmp[i] = arr[i];
            }

        }
        arr = tmp;
    }

    public void clear() {
//        int [] tmp = new int[arr.length - arr.length]; // 0
//        arr = tmp;
        arr= new int[0];
    }

    public int size(){
        return arr.length;
    }

    public int get(int n) {
        return arr[n];
    }

    public int get(int n, int n2) {
        for (int i = n; i<=n2; i++) {

        }
        return arr[n];
    }


    @Override
    public String toString() {
        if(arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[" + arr[0]);
        for (int i = 1; i<arr.length; i++){
            sb.append(", ");
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
