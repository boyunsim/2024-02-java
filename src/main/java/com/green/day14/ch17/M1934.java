package com.green.day14.ch17;

import java.util.Scanner;

public class M1934 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[][] num = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            for (int z = 0; z < 2; z++) {
//                num[i][z] = scan.nextInt();
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            List<Integer> list = new ArrayList();
//            while (true) {
//                boolean i1 = (double) num[i][0] / 1 == 1 || (double) num[i][0] / 2 == 1 || (double) num[i][0] / 3 == 1 || (double) num[i][0] / 5 == 1 || (double) num[i][0] / 7 == 1;
//                boolean i2 = (double) num[i][1] / 1 == 1 || (double) num[i][1] / 2 == 1 || (double) num[i][1] / 3 == 1 || (double) num[i][1] / 5 == 1 || (double) num[i][1] / 7 == 1;
//                boolean i3 = num[i][0] % 2 != 0 && num[i][0] % 3 != 0 && num[i][0] % 5 != 0 && num[i][0] % 7 != 0;
//                boolean i4 = num[i][1] % 2 != 0 && num[i][1] % 3 != 0 && num[i][1] % 5 != 0 && num[i][1] % 7 != 0;
//                if (num[i][0] % 2 == 0 && num[i][1] % 2 == 0) {
//                    num[i][0] = (num[i][0] / 2);
//                    num[i][1] = (num[i][1] / 2);
//                    list.add(2);
//                } else if (num[i][0] % 3 == 0 && num[i][1] % 3 == 0) {
//                    num[i][0] = (num[i][0] / 3);
//                    num[i][1] = (num[i][1] / 3);
//                    list.add(3);
//                } else if (num[i][0] % 5 == 0 && num[i][1] % 5 == 0) {
//                    num[i][0] = (num[i][0] / 5);
//                    num[i][1] = (num[i][1] / 5);
//                    list.add(5);
//                } else if (num[i][0] % 7 == 0 && num[i][1] % 7 == 0) {
//                    num[i][0] = (num[i][0] / 7);
//                    num[i][1] = (num[i][1] / 7);
//                    list.add(7);
//                }
//                if (list.size() == 0) {
//                    int num1 = num[i][0], num2 = num[i][1];
//                    System.out.println(num1*num2);
//                    break;
//                } else if ((i1&&i2) || (i1&&i4) || (i3&&i4) || (i3&&i2) || (i2||i1)&&(list.size() != 0)) {
//                    int k = 1;
//                    for (int z=0; z<list.size(); z++) {
//                        k *= list.get(z);
//                    }
//                    int num1 = num[i][0], num2 = num[i][1];
//                    System.out.println((k*num1*num2));
//                    break;
//                }
//            }
//        }
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] num = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int z = 0; z < 2; z++) {
                num[i][z] = scan.nextInt();
            }
        }
        for (int i = 0; i<n; i++) {
            if(num[i][0] > num[i][1]) {
                System.out.println(num[i][0]*num[i][1]/gcd(num[i][0], num[i][1]));
            } else {
                System.out.println(num[i][0]*num[i][1]/gcd(num[i][1], num[i][0]));
            }
        }
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

