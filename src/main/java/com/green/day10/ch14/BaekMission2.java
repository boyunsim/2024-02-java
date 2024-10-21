package com.green.day10.ch14;

import java.util.Scanner;

public class BaekMission2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] input = new int[9][9];

        int max = 0;
        int hang = 0, yeol = 0;
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++) {
                input[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++) {
                if (input[i][j] > max) {
                    max = input[i][j];
                    hang = i;
                    yeol = j;

                }

            }

        }
        System.out.println(max);
        System.out.printf("%d %d",hang+1 ,yeol+1);
    }
}
