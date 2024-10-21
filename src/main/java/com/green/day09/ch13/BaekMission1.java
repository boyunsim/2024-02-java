package com.green.day09.ch13;

import java.util.Scanner;

public class BaekMission1 {
    public static void main(String[] args) {
        int[] input = new int[30];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<28; i++){
            int k;
            System.out.print(">> ");
            k = scan.nextInt();
            input[k-1] = k;
        }
        int[] n = new int[2];
        int k = 0;
        for(int i = 0; i<30; i++){
            if(input[i]-input[i+1]==input[i]) {
                if(input[i]-input[i+2]==input[i]){
                    n[k] = input[i]+1;
                    n[k+1] = input[i]+2;
                    break;
                }
                n[k] = input[i]+1;
                k++;
                if(k==2){
                    break;
                }
            }
        }
        System.out.println(n[0]<n[1] ? n[0]:n[1]);
        System.out.println(n[0]>n[1] ? n[0]:n[1]);


    }
}
