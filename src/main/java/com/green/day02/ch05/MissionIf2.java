package com.green.day02.ch05;

public class MissionIf2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int score = (int) (Math.random() * 101.0);
            System.out.printf("random 값은 %d", score);
            if(score>=90){
                System.out.println("성적은 A");
            } else if (score>=80){
                System.out.println("성적은 B");
            } else if (score>=70){
                System.out.println("성적은 C");
            } else {
                System.out.println("성적은 D");
            }

            /*
                score 90이상이면 A 출력
                      80이상이면 B 출력
                      70이상이면 C 출력
                      나머지는 D 출력
             */

        }

    }
}
