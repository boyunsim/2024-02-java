package com.green.day03.ch05;

public class MissionContinueBreakResult {
    public static void main(String[] args) {
        /*
            자연수 1부터 시작해서 모든 홀수를 더해 나간다
            그리고 그 합이 언제(몇을 더했을 때) 1,000을 넘어서는지
            그리고 1,000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성
         */
//        int sum = 0;
//        int count = 0;
//        for (int i = 1; ;i++) {
//            if(i%2==1){
//                sum += i;
//                if(i==1){
//                    continue;
//                }
//                count++; //Very Good
//                System.out.printf("%d. %d\n", count,  sum);
//                if (sum >= 1000) {
//                    System.out.printf("마지막 더한 값은: %d\n", i);
//                    System.out.printf("1부터 더했을 시 %d번째에 1,000을 넘습니다.\n", count);
//                    System.out.printf("그리고 그값은 %d 입니다.\n", sum);
//                    break;
//                }
//            }
//
//        }
        int i = 1;
        int odd = 0;
        while(odd < 1000) {
            if ( (i % 2) == 1) {
                System.out.println("i: " + i);
                odd += i;
                System.out.println("odd: " + odd);
            }
            i++;
        }
    }
}
