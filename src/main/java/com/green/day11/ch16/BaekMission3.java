package com.green.day11.ch16;

import java.util.Scanner;

public class BaekMission3 {
    static int check;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        String[][] input = new String[num][2];
        for (int i = 0; i<num; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(scan2.nextLine());
            int a = sb.indexOf(" ");
            input[i][1] = sb.substring(a+1);
            input[i][0] = sb.substring(0, a);
        }
        String str1 = input[num-1][0] + input[num-1][1];
        for(int i = 0; i< input.length-1; i++) {
            String str2 = input[i][0] + input[i][1];
            String str3 = input[i][1] + input[i][0];
            if (str1.equals(str2) || str1.equals(str3)) {
                check = 1;
                break;
            }
            check = 0;
        }
        System.out.print(check);
    }
}
