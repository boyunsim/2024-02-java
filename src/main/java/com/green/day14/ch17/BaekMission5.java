package com.green.day14.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaekMission5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] num = new int[n][2];
        for(int i = 0; i<n; i++) {
            for (int z = 0; z<2; z++){
                num[i][z] = scan.nextInt();
            }
        }
        int[] gongbae = new int[n];
        for(int i =0; i<n; i++) {
            while(true) {
                List<Integer> list = new ArrayList();
                if(n % 2 != 0 && n % 3 != 0 && n % 5 != 0 && n % 7 != 0) {
                    break;
                }
                if((double)n/1 == 1 || (double)n/2 == 1 || (double)n/3 == 1 || (double)n/5 == 1 || (double)n/7 == 1) {

                }
                if(num[i][0]%2==0 && num[i][1]%2==0){
                    num[i][0] = (num[i][0] / 2);
                    num[i][1] = (num[i][1] / 2);
                    list.add(2);
                }else if(num[i][0]%3==0 && num[i][1]%3==0){
                    num[i][0] = (num[i][0] / 3);
                    num[i][1] = (num[i][1] / 3);
                    list.add(3);
                }else if(num[i][0]%5==0 && num[i][1]%5==0){
                    num[i][0] = (num[i][0] / 5);
                    num[i][1] = (num[i][1] / 5);
                    list.add(5);
                }else if(num[i][0]%7==0 && num[i][1]%7==0){
                    num[i][0] = (num[i][0] / 7);
                    num[i][1] = (num[i][1] / 7);
                    list.add(7);
                }







        }
        int two1 = 0, thr1 = 0, fv1 = 0, sev1 = 0;
        int sosu1 = two1 + thr1 + fv1 + sev1;
        for(int i =0; i<n; i++) {
            while(true) {
                if(n % 2 != 0 && n % 3 != 0 && n % 5 != 0 && n % 7 != 0) {
                    break;
                }
                if((double)n/2 == 1 || (double)n/3 == 1 || (double)n/5 == 1 || (double)n/7 == 1) {

                }
                if(num[i][1]%2==0){
                    num[i][0] = (num[i][0] / 2);
                    two0++;
                }else if(num[i][0]%3==0){
                    num[i][1] = (num[i][0] / 3);
                    thr0++;
                }else if(num[i][0]%5==0){
                    num[i][1] = (num[i][0] / 5);
                    fv0++;
                }else if(num[i][0]%7==0){
                    num[i][1] = (num[i][0] / 7);
                    sev0++;
                }
            }
        }
        System.out.println(two0);

    }
}
