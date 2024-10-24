package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    /*
        List 인터페이스, Interface(인터페이스)는 객체화 불가능하다.

        인터페이스는 부모역할만 한다. List를 상속받은
        class(LinkedList, ArrayList)가 있다.
        둘 class는 결과는 똑같은데 처리방식이 다르다.
        LinkedList는 Node방식으로 데이터를 다루고
        ArrayList는 Array(배열)방식으로 데이터를 다룬다.
        LinkedList 수정 위주의 작업이 많으면 유리하고
        ArrayList 읽기 위주의 작업이 많으면 유리하다.

        List 변수명 = new ArrayList();
        List 변수명 = new LinkedList();
        이렇게 작성이 가능하다.
     */
    public static void main(String[] args) {
        List list = new ArrayList(); //List로 하는게 더 유연하다.
        list.add(10); //0번방에 10값이 주입
        list.add(20); //1번방에 20값이 주입

        ArrayList list2 = (ArrayList) list; //굳이 안한다 >> List에 존재하는 method만 사용하기 때문에
        list2.add(30); //2번방에 주입
        list2.add("하하"); //3번방에 주입

        int[] arr = new int[3];
        //arr[0] = "하하";

        int val0 = (int)list2.get(0); //Object에서 int로 형변환
        System.out.println("val0: " + val0); //제일 처음 들어간 값이 10이므로 10을 출력한다

        //val3 = ??; //3번 방에 있는 값 읽기
        //System.out.println("val3: " + val3);

        String val3 = (String)list2.get(3); //Object에서 String으로 형변환
        System.out.println("val3: " + val3);

        Object[] arr2 = new Object[4];
        arr2[0] = 10;
        arr2[1] = "하하"; //이것 저것 모든 타입이 들어갈 수 있다.
                         // (좋은거 아님 헷갈림, 값 체크를 매번 해야함)

        System.out.println(list);
        System.out.println(list2);
    }
}
