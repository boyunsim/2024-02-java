package com.green.day03.ch05;

public class ForInFor {
    public static void main(String[] args) {
        /* 중첩 for문 */
        for(int i = 0; i < 5; i++) {
            System.out.println("------------------------------");

            for(int z = 0; z < 5; z++) {
                if (i+z == 2 || z-i == 2 || i-z == 2 || (i==3 && z==3)) {
                    System.out.print("[ |* ]");
                }else {
                    System.out.printf("[%d, %d]", i , z);
                }
            }
            System.out.println();
        }
    }
}
