package com.green.day02.ch05;

public class Score {
    public static void main(String[] args) {
        //랜덤값중 100점이 나오면 축하해주는 프로그램
        for (int i =0; ; i++) {
            int score = (int)(Math.random()*101);
            System.out.println(score);
            if(score == 100) {
                System.out.println("축하합니다 더 이상 올라갈 점수가 없으십니다!");
                break;
            }
        }
    }
}
