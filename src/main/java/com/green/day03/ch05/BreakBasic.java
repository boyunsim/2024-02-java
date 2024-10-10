package com.green.day03.ch05;

public class BreakBasic {
    public static void main(String[] args) {
        int n = 1;
        boolean search = false;

        while(n < 100) {
            if( ((n % 5) == 0) && ((n % 7) == 0) ) {
                search = true;
                break; // 반복문 안에서 break을 만나면 바로 반복문에서 빠져나온다.
            }
            n++;
        }
        if(search) {
            System.out.printf("찾는 정수: %d\n", n);
        } else {
            System.out.println("못 찾음");
        }
    }
}
