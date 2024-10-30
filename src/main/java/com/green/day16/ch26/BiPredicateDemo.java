package com.green.day16.ch26;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        //특정 문자열의 길이가 내가 정한 정수값 보다 크면 true, 아니면 false
        BiPredicate<String, Integer> conv = (str, len) -> str.length() > len;

        System.out.println(conv.test("Robot",3));
        System.out.println(conv.test("Box",3));

        String str1 = "Hello";
        String str2 = "Haloo";
        System.out.println(str1.length());
        BiPredicate<String, String> conv2 = (str3, str4) -> str3.length() == str4.length();

        if(conv2.test(str1,str2)) {
            System.out.println("길이 같음");
        } else {
            System.out.println("길이 다름");
        }


    }
}
