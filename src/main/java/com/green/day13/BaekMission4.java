package com.green.day13;

import java.util.Scanner;

public class BaekMission4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i<2*n-1; i++){
            for(int z= 0; z<2*n-1; z++){
                if(i<n) {
                    if(n-1-i<=z && z<=n-1+i) {
                        System.out.print("*");
                    } else if (n-1-i>z) {
                        System.out.print(" ");
                    }
                }
                if(i>=n) {
                    if(n-1-((2*n-2)-i)<=z && z<=n-1+((2*n-2)-i)) {
                        System.out.print("*");
                    } else if(n-1-((2*n-2)-i) > z){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

