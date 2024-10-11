package com.green.day04.ch05;

//p.135
public class Mission05_7_1 {
    public static void main(String[] args) {
       /*
            1번. 구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을
            작성하되 2단은 2 x 2까지
        */
        /*
        for (int i=1; i<10; i++) {
            for (int j=1; j<10; j++) {
                if(i%2==0) {
                    System.out.printf("%d x %d = %d\n", i, j, (i*j));
                    if(i==j){
                        break;
                    }
                }
            }
        }
         */
        int i = 1;
        while(i < 10) {
            int j = 1;
            while(j < 10) {
                if(i % 2 == 0) {
                    System.out.printf("%d x %d = %d\n", i, j, (i * j));
                }
                if(i==j){
                    break;
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
