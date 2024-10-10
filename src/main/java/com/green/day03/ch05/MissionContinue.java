package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {
        /*
        ContinueBasic의 존재하는 while 을 for문으로
         */

        int count = 0;

//        while((n++) < 100) {
//            if( (n % 5) != 0 || (n % 7) != 0) {
//                continue;
//            }
//            count++;
//            System.out.println("n: " + n);
//        }
//        System.out.println("count: " + count);

        for (int n = 1;  n<=100; n++) {
            if( (n % 5 == 0) && (n % 7 == 0)) {
                System.out.println("n: " + n);
                count++;
            }
        }
        System.out.println("count: " + count);

        int count2 = 0;
        for (int i = 0; i <= 100; i++) {
            if ((i % 5 != 0) || (i % 7 != 0)){
                continue;
            }
            System.out.println("i: " + i);
            count2++;
        }
        System.out.println("count2: " + count2 );
    }
}
