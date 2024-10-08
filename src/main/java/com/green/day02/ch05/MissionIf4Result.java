package com.green.day02.ch05;

public class MissionIf4Result {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101.0);
        System.out.printf("random 값은 %d\n", score);
        /*
            100점이면 A+
            98이상이면 A+
            94이상 97이하 A0
            90이상 93이하 A-

            88이상 89이하 B+
            84이상 87이하 B0
            80이상 83이하 B-

            78이상 79이하 C+
            74이상 77이하 C0
            70이상 73이하 C-

            나머지 D
         */
        /*
        if (score >= 98){
            System.out.println("A+");
        } else if (score >=94) {
            System.out.println("A0");
        } else if (score >=90 ) {
            System.out.println("A-");
        } else if (score >=88) {
            System.out.println("B+");
        } else if (score >=84) {
            System.out.println("B0");
        } else if (score >=80) {
            System.out.println("B-");
        } else if (score >=78) {
            System.out.println("C+");
        } else if (score >=74) {
            System.out.println("C0");
        } else if (score >=70) {
            System.out.println("C-");
        } else {
            System.out.println("D");
        }

       if (score - 98 >= 0){
           System.out.println("A+");
       } else if(score - 94 >= 0){
           System.out.println("A0");
       } else if(score - 90 >= 0){
           System.out.println("A-");
       } else if(score - 88 >= 0){
           System.out.println("B+");
       } else if(score - 84 >= 0){
           System.out.println("B0");
       } else if(score - 80 >= 0){
           System.out.println("B-");
       } else if(score - 78 >= 0){
           System.out.println("C+");
       } else if(score - 74 >= 0){
           System.out.println("C0");
       } else if(score - 70 >= 0){
           System.out.println("C-");
       } else{
           System.out.println("D");
       }
       */
       // 반복문 쓰지 말아야 하는 이유 엄청 복잡하기만하고 구현도 어렵다
       for (int i = 1; i <= 15; i++){
           if((i*2) >= score){
               int j = 1;
               if (i <= 5*j) {
                   if(j==1) {
                       System.out.print("A");
                       if(i==1){
                           System.out.println("+");
                       } else if(i<=3) {
                           System.out.println("0");
                       } else {
                           System.out.println("-");
                       }
                   } else if(j==2) {
                       System.out.print("B");
                       if(i==6){
                           System.out.println("+");
                       } else if(i<=8) {
                           System.out.println("0");
                       } else {
                           System.out.println("-");
                       }
                   } else {
                       System.out.print("C");
                       if(i==11){
                           System.out.println("+");
                       } else if(i<=13) {
                           System.out.println("0");
                       } else {
                           System.out.println("-");
                       }
                   }


               }


           }
       }




    }
}
