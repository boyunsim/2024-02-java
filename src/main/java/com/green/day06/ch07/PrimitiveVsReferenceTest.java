package com.green.day06.ch07;

/*
    일반 변수(Primitive type) >> c#에는 없는데 왜 자바에는 있나? 처리속도가 훨씬 빠르기 때문에!
    참조 변수(Reference type)
    차이점을 설명하는 예제
 */
public class PrimitiveVsReferenceTest {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = num;
        //참조변수로 주소접근하여 쓸 수있는 목록은 대부분 method이다. 멤버필드는 private(은닉화)이기 때문에 사용불가(상수 제외)
        changeNum(num);
        System.out.println("num: " + num);

        NumberBox nb = new NumberBox(); //예를들어 0x3 주소가 nb에 복사 되었다.
        nb.num = 10; //주소로 접근을 해서 num을 10으로 변경했다.

        changeNum(nb);
        System.out.println("nb.num: " + nb.num);
        //결론적으로 method를 통해서 변수를 변경하는것은 불가능하다.(일반,참조 둘다)
    }

    /*
        main메소드에 있는 num변수(main-num)과 changeNum메소드에 있는 num매개변수 (m-num)은
        다른 공간이다. main-num이 가지고 있는 값을 복사하여 m-num에 저장했다.
        m-num값을 변경한다고 하여 main-num값이 변경되는 것은 아니다. 왜? 다른 공간이기 때문
     */
    public static void changeNum(int num) {
        num = 100; //일반 변수의 스코프는 이 안이기 때문에 죽고 메인 메소드의 num값은 바뀌지 않는다.
    }

    public static void changeNum(NumberBox nb) {
        nb = new NumberBox(); //다른 공간에서 객체 생성(메인 메소드의 객체와 다른 주소)을 해서 NumberBox의 num이 변경되지 않는다 >> 내 생각(정답!)
        nb.num = 100;
    }
    /*
        main메소드에 있는 nb변수(main-nb)와 change Num메소드에 있는 nb매개변수(m-nb)는
        다른 공간이다. 다만 같은 값(주소값)을 가지고 있다. 그로인해 같은 개체에 접근할 수 있다.
        m-nb를 통해 객체의 num 값을 변경으 했다면 main-nb를 통해 접근했을 때 변경된 값을 얻게 된다.
     */
}

class NumberBox {
    int num;
}
