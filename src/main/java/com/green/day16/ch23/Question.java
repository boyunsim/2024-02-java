package com.green.day16.ch23;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = new String("abCdEfghIJ");
        System.out.println(s.solution(str));

    }
}
class Solution {
    public String solution(String my_string) {
        char[] ch = my_string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                ch[i] = Character.toLowerCase(ch[i]);
            } else {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        return String.valueOf(ch);
    }
}

