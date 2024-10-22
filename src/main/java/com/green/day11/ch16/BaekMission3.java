package com.green.day11.ch16;

import java.util.Arrays;
import java.util.Scanner;

public class BaekMission3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        String[][] input = new String[num][2];
        for (int i = 0; i<num; i++) {
            String str = new String();
            StringBuilder sb = new StringBuilder();
            str = scan2.nextLine();
            sb.append(str);
            int a = sb.indexOf(" ");
            input[i][1] = sb.substring(a+1);
            input[i][0] = sb.substring(0, a);
        }

    }
}
