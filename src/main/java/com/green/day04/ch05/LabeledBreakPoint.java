package com.green.day04.ch05;
//p.134
public class LabeledBreakPoint {
    public static void main(String[] args) {
        int n = 1;
        outering:
        while(true) {
            while(true) {
                if(n==10){
                    break;  //break outering; 으로 대체 한다면 처음 while문 의 println("aaaaaaaaaa..")에 빨간줄이 뜬다
                }
                n++;
            }
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
            break;
        }
        //구구단에서 곱의 결과가 72인 결과를 딱 하나만 보여라.

        outer:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if((i * j) == 72) {
                    System.out.printf("%d X %d = %d\n", i, j, (i * j));
                    break outer;
                }
            }
        }
        System.out.println("-- end --");
    }
}
