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
            String str = new String();
            StringBuilder sb = new StringBuilder();
            str = scan2.nextLine();
            sb.append(str);
            int a = sb.indexOf(" ");
            input[i][1] = sb.substring(a+1);
            input[i][0] = sb.substring(0, a);
        }
        String str1 = input[num-1][0] + input[num-1][1];
//        for (String[] item : input)
//            String str2 = item[0] + item[1];
//            String str3 = item[1] + item[0];
//            if (str1.equals(str2) || str1.equals(str3)) {
//                check = 1;
//                break;
//            }
//            check = 0;
//        }
//        System.out.println(check);
        for(int i = 0; i< input.length-1; i++) {
            String str2 = input[i][0] + input[i][1];
            String str3 = input[i][1] + input[i][0];
            if (str1.equals(str2) || str1.equals(str3)) {
                check = 1;
                break;
            }
            check = 0;
        }
        System.out.println(check);
    }
}
