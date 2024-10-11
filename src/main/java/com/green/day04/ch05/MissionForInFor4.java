package com.green.day04.ch05;

public class MissionForInFor4 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6.0) + 3;
        /*
            star = 4
            *
            **
            ***
            ****
         */
        System.out.println("star = " + star);
        for (int i = 1; i <= star; i++) {
            for(int j = 1; j <= star; j++){
                if (j - i <= 0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        for (int i = 1; i<= star; i++){
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
