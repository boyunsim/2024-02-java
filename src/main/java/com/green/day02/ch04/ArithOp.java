package com.green.day02.ch04;

public class ArithOp {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 3;
        for(int i=1; i<=9; i++){
            for (int j=1; j<=9; j++) {

//                System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
//                System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
                System.out.printf("%d * %d = %d\n", i, j, (i * j));
//                System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
//                System.out.printf("%d %% %d = %d\n", n1, n2, (n1 % n2));

            }   // % 두번 쓰는 이유는 printf 에서 %d, %s 등 기능이 존재하므로 %(mod) 를 표기 하기 위해서는 %%로 해야한다
            System.out.println("----------------\n");
        }
    }
}
