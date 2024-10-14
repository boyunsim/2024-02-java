package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {
        printStar(4);
        System.out.println();
        printUnder(4);
        System.out.println();
        printStar(2);
        System.out.println();
        printStarSquare(4);
        printStarTriangle(4);
        printStarUnder(4);
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
    static void printStarTriangle(int n) {
        for(int i= 1; i<=n; i++){
            printStar(i);
            System.out.println();
        }
    }
    static void printStarUnder(int n) {
        int j = 1;
        for(int i = n-1; 0 <= i; i--){
            printUnder(i);
            printStar(j);
            j++;
            System.out.println();
        }
    }
    static void printStarSquare(int n) {
        for (int i = 1; i<=n; i++) {
            printStar(n);
            System.out.println();
        }
    }

}
