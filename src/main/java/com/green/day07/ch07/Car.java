package com.green.day07.ch07;

public class Car {
    private String color;
    private String gearType; //auto, manual
    private int door;

    public Car() {
//        color = "white";
//        gearType = "auto";
//        door = 4;
        /*
            this 사용법은 2가지가 있다.
            1. this. : 멤버필드, 멤버메소드 사용, this. 생략가능할 때가 있다.
            2. this() : 생성자에서 다른 생성자 호출시 사용 가능
                        >> 메소드에서는 사용 불가(생성자는 객체 생성 이후에는 호출 불가하기 때문)
         */
        //this.introduce();
        //introduce();
        this("white", "auto", 4); //생성자에서 메소드호출은 원래 방식이고
                                  //생성자에서 생성자호출은 this를 사용한다.
                                  //>> 생성자에서 생성자를 호출하면 일을 몰아주기 때문에 관리를 한곳에서 하면된다.
    }
    public Car(String gearType, int door){
        this("white", gearType, door);
    }

    public Car(String color, String gearType, int door) {
        this.color = color; //매개변수명이 멤버필드명과 달랐다면 this. 생략 가능
        this.gearType = gearType;
        this.door = door;
    }

    public void introduce() {
        //this("dd", "ddd", 12); //introduce메소드가 호출이 된다는 말은 이미 객체생성이 끝난 이후이다.
        //생성자는 객체 생성시에만 호출할 수 있기 때문에 객체생성 이후에는 호출 불가
        System.out.printf("%s 컬러의 %s 기어를 가진 %d개의 문짝이 있는 자동차\n"
                          , color, gearType, door);
    }
}

class CarTest {
    public static void main(String[] args) {
        //main메소드의 내용을 수정하지 않고
        //생성자를 이용하여
        //"white 컬러의 auto 기어를 가진 4개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요.
        Car c1 = new Car();
        c1.introduce();

        Car c2 = new Car();
        c2.introduce();

        Car c3 = new Car("red", "manual", 5);
        c3.introduce();

        Car c4 = new Car("auto", 6);
        c4.introduce();
        //"white 컬러의 auto 기어를 가진 6개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요.
    }
}