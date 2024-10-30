package com.green.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom = () -> (int)(Math.random() * 50.0); //0~49
        Supplier<Integer> supRandom2 = () -> (int)(Math.random() * 31.0) + 20; //20~50
        System.out.println(supRandom.get());

        List<Integer> list = makeIntList(supRandom, 5);
        //랜덤 정수값 (0~49) 5개를 가지고 있는 ArrayList를 리턴
        System.out.println(list);
        List<Integer> list2 = makeIntList(supRandom2, 8);
        //랜덤 정수값 (20~50) 5개를 가지고 있는 ArrayList를 리턴
        System.out.println(list2);
    }
    static List<Integer> makeIntList (Supplier<Integer> s, int n) {
        List<Integer> list = new ArrayList<>(n); //객체 생성시 정수값을 넣으면 성능향상에 좋음
        for (int i = 0; i < n; i++) {
            list.add(s.get());
        }
        return list;
    }
}
