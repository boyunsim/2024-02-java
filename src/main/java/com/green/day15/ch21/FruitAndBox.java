package com.green.day15.ch21;
//p.480
//Generic이 없던 시절의 코드
public class FruitAndBox {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        AppleBox ab = new AppleBox(apple);
        OrangeBox ob = new OrangeBox(orange);
        System.out.println(ab.getAp());
        System.out.println(ob.getOrange());
    }
}

class Apple {
    @Override
    public String toString() {
        return "사과";
    }
}

class Orange {
    @Override
    public String toString() {
        return "오렌지";
    }
}

class AppleBox {
    private Apple ap;

    //private한 멤버필드에 값 넣는 방법(2)
    //1.생성자
    //2.setter메소드

    AppleBox(Apple ap) {
        this.ap = ap;
    }

    Apple getAp() {
        return ap;
    }

}

class OrangeBox {
    private Orange orange;

    //private한 멤버필드에 값 넣는 방법(2)
    //1.생성자
    //2.setter메소드

    OrangeBox(Orange orange) {
        this.orange = orange;
    }

    Orange getOrange() {
        return orange;
    }

}
