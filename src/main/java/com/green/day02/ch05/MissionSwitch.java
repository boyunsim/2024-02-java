package com.green.day02.ch05;

import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        //남성은 172cm, 여성은 159cm 평균
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요. (여/남)");
        String gender = scan.next();
        System.out.print("키를 정수값으로 입력해 주세요.(cm)");
        int height = scan.nextInt();

        //당신은 평균입니다.
        //당신은 평균보다 큽니다.
        //당신은 평균보다 작습니다.
        int sthe =169;
        switch(gender) {
            case "남":
                sthe = 172;
                break;
        }
        System.out.printf("성별: %s, 키: %d >> 당신은 평균", gender, height);
        if(height == sthe){
            System.out.println("입니다");
        } else if (height > sthe){
            System.out.println("보다 큽니다");
        } else {
            System.out.println("보다 작습니다");
        }

    }
}
