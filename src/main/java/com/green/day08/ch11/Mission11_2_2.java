package com.green.day08.ch11;

public class Mission11_2_2 {
    /*
        다음 전화번호의 중간에 삽입된 '-'들을 지우고 공백으로 채워서 출력하는 프로그램 작성해보자.
     */
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("010-1234-5678");
//        for (int i = 1; i<=2; i++){
//            int n = s1.indexOf("-");
//            s1.replace(n,n+1," ");
//            System.out.println(s1);
//        }

        int dashIdx1 = s1.indexOf("-");
        int dashIdx2 = s1.lastIndexOf("-");
        s1.replace(dashIdx1,dashIdx1 + 1," ").replace(dashIdx2,dashIdx2 + 1," ");
        String sub = s1.substring(0, 3);
        System.out.println(sub);
        String sub2 = s1.substring(4, 8);
        System.out.println(sub2);
        String sub3 = s1.substring(9, 13);
        System.out.println(sub3);
    }
}
