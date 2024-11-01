package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        //Generic 제네릭
        //제네릭을 사용하면 실행시에 타입이 결정이 된다.
        //제네릭을 이용한 클래스에 타입을 결정하지 않으면 타입은 Object가 된다.
        //아래 3가지의 결과는 같다. 맘에드는걸로 골라잡아 쓰자.
        List<Integer> list = new ArrayList(); //이제부터 정수만 들어간다
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<Integer>();
        //list.add(""); //정수형 값만 들어갈 수 있는 ArrayList객체가 만들어짐
        list.add(10); //0
        list.add(20); //1 60이 되고 20은 2번방으로 밀려난다.
        list.add(30); //2 >> 3번방으로 밀려난다.
        System.out.println(list);
        System.out.println(list.size());

        int n1 = list.get(0); //형변환 하지 않아도 된다. list에 제일 처음 들어간 int 정수 값
        System.out.println("n1: " + n1);
        list.add(1, 60); //1에 추가
        System.out.println(list);
        System.out.println(list.size());

        list.remove(2); //2번방의 20 삭제!! 배열하나 줄어듦!
        System.out.println(list);
        System.out.println(list.size());

        list.add(0, 30);
        System.out.println(list);

        System.out.println("list.lastIndexOf(30): " + list.lastIndexOf(30));
        System.out.println("list.IndexOf(30): " + list.indexOf(30));
        System.out.println("list.IndexOf(): " + list.indexOf("1")); //-1이 출력된다면 list안에 없구나!

        list.clear();
        System.out.println(list);
        System.out.println(list.size());


        System.out.println("-----------------------");

        List<String> list4 = new ArrayList<>();
        list4.add("");
        list4.add("하하");
        list4.add("히히");

        System.out.println(list4);

    }
}
