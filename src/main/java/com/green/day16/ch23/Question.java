package com.green.day16.ch23;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        String str1 = "aAb1B2cC34oOp";
        int sum = 0 ;
        for(int i=0; i<str1.length(); i++){
            for(int z =1; z<=9; z++) {
                if(str1.indexOf(z)!=-1) {
                    sum += z;
                }
            }
        }
        System.out.println(sum);
    }
}

class Solution {
    public String solution(String rsp) {
        String rsp0 = rsp.replace("0", "6");
        String rsp1 = rsp.replace("2", "7");
        String rsp2 = rsp.replace("5", "8");
        String rsp3 = rsp.replace("6", "5");
        String rsp4 = rsp.replace("7", "0");
        String answer = rsp.replace("8", "2");

        return answer;
    }
}


