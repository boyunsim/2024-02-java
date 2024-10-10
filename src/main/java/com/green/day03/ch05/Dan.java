package com.green.day03.ch05;

public class Dan {
    public static void main(String[] args) {
        int count =0;
        for (int i=1; i<=9; i++) {

            for (int n=1; n<=9; n++){
                System.out.printf("%d X %d = %d\n", i, n, (i*n));
            }
            System.out.println("-----------");
            if(i==9) {
                i=0;
                count++;
                if(count == 3){
                    break;
                }
            }
        }
    }
}
