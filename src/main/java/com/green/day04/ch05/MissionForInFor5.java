package com.green.day04.ch05;

public class MissionForInFor5 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6.0) + 3;
        System.out.println(star);
        for (int i = star; i > 0; i--){
            for(int j = 1; j <= star; j++) {
                if(i > j){
                    System.out.print("_");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= star; i++) {
            for (int j = (star - i); j >= 1; j--) {
                System.out.print("_");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
