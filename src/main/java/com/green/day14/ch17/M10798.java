package com.green.day14.ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M10798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = new String[5];
        for(int i = 0; i<5; i++){
            input[i] = scan.nextLine();
        }
        List<String> list = new ArrayList();
        for(int i = 0; i<15; i++) {
            for(int z=0; z<5; z++){
                if(i<input[z].length()) {
                    list.add(input[z].substring(i, i+1));
                }
            }
        }
        String result = new String();
        for(int i = 0; i<list.size(); i++) {
            result += list.get(i);
        }
        System.out.println(result);
    }
}
