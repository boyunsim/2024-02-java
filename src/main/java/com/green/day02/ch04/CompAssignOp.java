package com.green.day02.ch04;

public class CompAssignOp {
    public static void main(String[] args) {
        /*
            복합 대입 연산자
         */
        int n1 = 10;
        System.out.println(n1);
        n1 = n1 + 2;
        System.out.printf("n1: %d\n", n1);

        int n2 = 10;
        n2 += 2; // n2 = n2 + 2; 와 같은 식 줄여서 쓸 수 있다.
        System.out.printf("n2: %d\n", n2);

        int n3 = 5;
        n3 = n3 * 3;
        System.out.printf("n3: %d\n", n3);


        int n4 = 5;
        n4 *= 3; // 복합 대입 연사자를 활용하여 n3와 결과가 같도록 해주세요.
        System.out.printf("n4: %d\n", n4);

        int n5 = 6;
        n5 = n5 / 2;
        System.out.printf("n5: %d\n", n5);

        int n6 = 6;
        n6 /= 2;
        System.out.printf("n6: %d\n", n6);

        int n7 = 7;
        n7 %= 2;
        System.out.printf("n7: %d\n", n7);
    }
}