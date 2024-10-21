package com.green.day10.ch13;

import com.green.day09.ch13.MyArrays;

import java.util.Scanner;

public class GptMission1 {
    public static void main(String[] args) {
        int[] input = new int[10];
        Scanner scan = new Scanner(System.in);
        int zzak = 0, hol = 0;
        for(int i = 0; i<10; i++){
            System.out.print(">> ");
            input[i] = scan.nextInt();
            if(input[i] % 2 == 0) {
                zzak++;
            } else{
                hol++;
            }
        }
        int i = 0, j = 0;
        int[] zzak2 = new int[zzak];
        int[] hol2 = new int[hol];
        for(int item : input) {
            if(item % 2 == 0) {
                zzak2[i] = item;
                i++;
            } else {
                hol2[j] = item;
                j++;
            }
        }
        System.out.println(MyArrays.toString(zzak2));
        System.out.println(MyArrays.toString(hol2));
    }
}
