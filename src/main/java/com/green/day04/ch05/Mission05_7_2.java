package com.green.day04.ch05;

public class Mission05_7_2 {
    public static void main(String[] args) {
        /*
        다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램
            A B
          + B A
          ------
            9 9
         */
        for(int i = 0; i<10; i++) {
            for (int j = 0; j<10; j++) {
                if(i + j == 9) {
                    System.out.printf("  %d %d\n", i, j);
                    System.out.printf("+ %d %d\n", j, i);
                    System.out.println("--------");
                    System.out.println("  9 9");
                    System.out.println();
                }
            }
        }
    }
}
