package com.green.day15.ch21;

import java.util.Scanner;

public class Croissant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하시면 크루아상이 나옵니다.");
        System.out.print("입력: ");
        int n = scan.nextInt();

        for (int i = 0; i <= n - 2; i++) {
            for (int i2 = 1; i2 < n - i; i2++) { //입력 n이 5일때, 4,3,2,1로 줄어들며 공백 찍기
                System.out.print(" ");
            }
            for (int i3 = 0; i3 < (n - 2) * i + 1; i3++) {
                // 별 찍는 범위가 1 + 등비수열이라서 크로와상이 된듯
                // 등차수열로 바꿔야 마름모가 될것 같아요
                System.out.print("*");
            }
            //System.out.println(); // 하나만 있어야 할 것 같아요
            System.out.println();
        }
        System.out.println("----------------------------------");
        for (int i = n - 1; i < (n - 1) * (i + 2); i--) { // (int i = n - 1; i >= 0; i--) 로 변경하여도 결과가 같습니다
            for (int i2 = n; i2 < (n - 1) - i + 1; i2++) {
                // 입력 n이 5일때, (int i2 = 5; i2 < 5-i; i2++) 인데
                // >> 5-i는 5보다 절대 클 수 없어서 한번도 print(" ");이 실행이 안되어서 아래 for문 별이 처음부터 찍힌것 같아요
                // 범위를 변경해서 공백을 찍을 수 있도록 해주세요!
                System.out.print(" ");
            }
            for (int i3 = 0; i3 < (n - 2) * i + 1; i3++) {
                // 입력 n이 5일때, (int i3 = 0; i3 < 3*i + 1; i3++) >> 13부터 3개씩 줄어 들며 찍혔다.
                // 처음 for문 과 같이 등비 -> 등차로 바꿔보세요!
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
