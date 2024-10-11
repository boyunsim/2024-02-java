package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {
        printStar(5);
        System.out.println();
        printStar(2);
        System.out.println();
        printStar2(4);
        printUnder(4);
        printStarUnder(5);
    }
    static void printStar(int n) {
        for(int i=1; i<=n;i++){
            System.out.print("*");
        }
    }
    static void printUnder(int n) {
        for(int i=1; i<=n;i++){
            System.out.print("_");
        }
    }
    static void printStar2(int n) {
        for(int i= 1; i<=n; i++){
            printStar(i);
            System.out.println();
        }
    }
    static void printStarUnder(int n) {
        int j=1;
        for(int i = n-1; 0<=i; i--){
            printUnder(i);
            printStar(j);
            j++;
            System.out.println();
        }
    }
}
