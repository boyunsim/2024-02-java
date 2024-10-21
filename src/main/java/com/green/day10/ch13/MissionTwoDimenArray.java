package com.green.day10.ch13;

public class MissionTwoDimenArray {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학
                {100, 90, 80}, //영수
                {90, 90, 80}, //상철
                {80, 70, 60}, //광수
                {80, 70, 60} //철수
        };
        /*
            영수: 합계점수, 평균점수
            상철: 합계점수, 평균점수
            광수: 합계점수, 평균점수
            국어: 합계점수, 평균점수
            영어: 합계점수, 평균점수
            수학: 합계점수, 평균점수

         */
//        int[] young = score[0];
//        int[] sang = score[1];
//        int[] gwang = score[2];
        int ysum = 0, ssum = 0, gsum = 0;
        int ksum = 0, zsum = 0, msum = 0;
        System.out.println(score[0][1]);
        for(int i = 0; i<score.length; i++) {
            for(int i2 = 0; i2<score[0].length; i2++) {
                if(i==0) {
                    ysum += score[0][i2];
                } else if (i==1) {
                    ssum += score[1][i2];
                } else if (i==2){
                    gsum += score[2][i2];
                }
                if(i2==0) {
                    ksum += score[i][0];
                } else if (i2 == 1) {
                    zsum += score[i][1];
                } else if (i2 == 2) {
                    msum += score[i][2];
                }
            }
        }
        int hsum = ysum+ssum+gsum;
        int su = score[0].length;
        int zu = score.length;
        int zsu = score.length*score[0].length;
        System.out.printf("영수: %d, %d\n", ysum, ysum/su);
        System.out.printf("상철: %d, %d\n", ssum, ssum/su);
        System.out.printf("광수: %d, %d\n", gsum, gsum/su);
        System.out.printf("국어: %d, %d\n", ksum, ksum/zu);
        System.out.printf("영어: %d, %d\n", zsum, zsum/zu);
        System.out.printf("수학: %d, %d\n", msum, msum/zu);
        System.out.printf("학급: %d, %d\n", hsum, hsum/zsu);

    }
}
