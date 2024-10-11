package com.green.day04.ch05;

public class MissionForInFor5Result {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6.0) + 3;
        System.out.println(star);
        for (int i = star; i > 0; i--){
            for(int j = 1; j <= star; j++) {
                System.out.print(j < i ? "_" : "*");
            }
            System.out.println();
        }
        for (int i = 1; i <= star; i++) {
            for (int j = star; j > i; j--) {
                System.out.print("_");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
