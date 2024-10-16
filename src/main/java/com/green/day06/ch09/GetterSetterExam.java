package com.green.day06.ch09;

import com.green.day01.ch01.SystemOutPrintLn;

public class GetterSetterExam {
    public static void main(String[] args) {
        Student s1 = new Student(); // s1 객체
        s1.setName("홍길동");
        //s1.name = "홍길동";

        Student s2 = new Student(); // s2 객체
        s2.setName("신사임당");
        //s2.name = "신사임당";

        s2.setName("심보윤");
        s2.setAge(26);
        s2.setHeight(169.3f);

        System.out.printf("저의 이름은 %s이고 나이는 %d, 키는 %.1f 입니다."
                           ,s2.getName(),s2.getAge(),s2.getHeight());

    }
}

class Student {
    private String name;
    private int age;
    private float height;

    //this는 상수이고 나 자신의 주소값이 저장된 공간
    //name-setter
    public void setName(String name) {
        this.name = name; //this가 안붙어 있으면 가장 가까운 name을 복사한다
        //전역변수에 넣으려고 애쓴다 >> 전역변수에 저장해야 사용할 수 있기 때문에
    }

    //name-getter
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return this.height;
    }
}
