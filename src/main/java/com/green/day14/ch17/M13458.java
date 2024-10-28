package com.green.day14.ch17;

import java.util.Scanner;

public class M13458 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] n2 = new int[n];
        for (int i = 0; i < n; i++) {
            n2[i] = scan.nextInt();
        }
        int[] n3 = new int[2];
        for (int i = 0; i < 2; i++) {
            n3[i] = scan.nextInt();
        }
        long gam = 0;
        for (int i = 0; i<n; i++) {
            if(n2[i]-n3[0] <= 0) {
                gam += 1;
            } else if(n2[i]-n3[0] <= n3[1]){
                gam += 2;
            } else {
                if((n2[i]-n3[0])%n3[1]==0){
                    gam += (n2[i]-n3[0])/n3[1] + 1;
                } else {
                    gam +=  (n2[i]-n3[0])/n3[1] + 2;
                }
            }
        }
        System.out.print(gam);
    }

}
