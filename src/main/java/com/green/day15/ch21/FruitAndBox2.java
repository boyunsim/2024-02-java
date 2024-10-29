package com.green.day15.ch21;

public class FruitAndBox2 {
    public static void main(String[] args) {
        FruitBox appleBox = new FruitBox(new Apple());
        FruitBox orangeBox = new FruitBox(new Orange());
        Apple apple = (Apple)appleBox.getFruit();
        Orange orange = (Orange)orangeBox.getFruit();

        FruitBox orangeBox2 = new FruitBox("오렌지");
        // Orange orange2 = (Orange)orangeBox2.getFruit(); >>다형성으로 처리 가능 but 상속없이 generic으로 하는게 더 nice!

        System.out.println("-- end --");
    }
}
class FruitBox {
    private Object fruit;

    FruitBox (Object fruit) {
        this.fruit = fruit;
    }

    Object getFruit() {
        return fruit;
    }
}
