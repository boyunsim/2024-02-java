package com.green.day05.ch06;

public class Question2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = new int[]{1, 2, 3, 3, 3, 4};
        s.solution(array);
        System.out.println(s.solution(array));
    }
}

class Solution {
    public int solution(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if(array[0] == array[i]) {

            }
        }
        return 1;
    }
}