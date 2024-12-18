package com.green.day10.ch13;

public class MissionTwoDimenArrayResult {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학, 사회
                {100, 90, 80, 30}, //영수
                {90, 90, 80, 40}, //상철
                {80, 70, 60, 90}, //광수
                {90, 75, 66, 40} //민우
        };
        /*
            영수: 합계점수, 평균점수
            상철: 합계점수, 평균점수
            광수: 합계점수, 평균점수
            민우: 합계점수, 평균점수
            국어: 합계점수, 평균점수
            영어: 합계점수, 평균점수
            수학: 합계점수, 평균점수
            사회: 합계점수, 평균점수

         */
        String[] names = {"영수", "상철", "광수", "민우"};
        int[] namesScore = new int[names.length];

        String[] subjects = {"국어", "영어", "수학", "사회"};
        int[] subjectsScore = new int[subjects.length];

        for(int i = 0; i<score.length; i++) {
            for(int i2 = 0; i2<score[i].length; i2++) {
                namesScore[i] += score[i][i2];
                subjectsScore[i2] +=score[i][i2];
            }
        }
        int totalScore = 0;
        for (int i = 0; i<namesScore.length; i++){
            totalScore += namesScore[i];
            System.out.printf("%s: %4d, %.1f\n", names[i], namesScore[i], (float)namesScore[i]/names.length);
        }
        for (int i = 0; i<subjectsScore.length; i++){
            System.out.printf("%s: %4d, %.1f\n", subjects[i], subjectsScore[i], (float)subjectsScore[i]/subjects.length);
        }
        System.out.printf("%s: %4d, %.1f\n", "학급", totalScore, (float)totalScore/(subjects.length*names.length));
    }
}
