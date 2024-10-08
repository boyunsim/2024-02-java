package com.green.day02;

public class PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을 때 사용

         */
        String name = "홍길동";
        int age = 22;
        float height = 172.5f;
        char bloodType = 'O';
        boolean isMan = true;

        System.out.printf("%s의 나이는 %d살 키는 %fcm 혈액형은 %c형입니다. 그는 남자입니까? %b\n"
                          , name, age, height, bloodType, isMan);
        System.out.printf("%s의 나이는 %s살 키는 %scm 혈액형은 %s형입니다. 그는 남자입니까? %s\n"
                          , name, age, height, bloodType, isMan);
        // %f 사이의 값을 주어서 기능을 활용할 수 있다. 12는 총 12칸을 차지한다.
        // 012는 12칸을 사용하는데 빈칸이 있으면 빈칸을 0으로 채운다. 음수를 넣으면 좌측 정렬 아니라면 우측 정렬->잘 안쓴다
        // .1는 실수를 나타내는 길이
        System.out.printf("키는 %.4f\n", 172.2843857); //Nice!!!!!!!
        System.out.printf("키는 %-12.1f\n", 172.2843857);

        int won = 230000000;
        System.out.printf("won: %,d원\n", won); //Nice!!!!!!!
        System.out.printf("won: %-12d원\n", won);
        System.out.printf("won: %012d원\n", won);
    }
}
