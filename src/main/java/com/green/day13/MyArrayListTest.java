package com.green.day13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add(20);
        System.out.println(list);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        list.add(1, 50);
        System.out.println(list);
        System.out.println(list.get(4));
        int removeValue = list.remove(1);
        System.out.println(removeValue);
//        list.remove(1, 3);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}
class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int removeValue = list.remove();
        System.out.println(removeValue);
        System.out.println(list.size());
        //마지막 방에 있는 값은 리턴
        // 마지막방도 없애야 함, 즉 size()는 3이 되어야 함
        System.out.println(list);
    }
}
