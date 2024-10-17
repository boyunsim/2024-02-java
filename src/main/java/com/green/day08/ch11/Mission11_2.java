package com.green.day08.ch11;

public class Mission11_2 {
    /*
        다음 주민등록 번호의 중간에 삽입된 '-'를 지우고 공백으로 채워서 출력하는 프로그램 작성해보자.
     */
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("990925-101299");
        int n = s1.indexOf("-");
        s1.replace(n,n+1," ");
        System.out.println(s1);
    }
}
