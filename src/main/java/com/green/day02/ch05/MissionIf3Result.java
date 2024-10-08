package com.green.day02.ch05;

import java.util.Scanner;

public class MissionIf3Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // new = 객체 생성 될 때
        System.out.print("숫자를 하나 입력하세요 >> ");
        int input = scan.nextInt();
        System.out.printf("input: %d\n", input);

        char result = (input % 2 == 0 ? '짝':'홀');
        System.out.printf("%d는(은) %c수입니다.\n", input, result);

        String result2 = (input % 2 == 0 ? "짝":"홀"); // 대문자로 시작하는 변수는 reference 변수 >> 객체의 주소값이 저장된다.
        System.out.printf("%d는(은) %s수입니다.\n", input, result2);


        System.out.println("--끝--");
    }
}
