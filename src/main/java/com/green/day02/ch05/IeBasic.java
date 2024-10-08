package com.green.day02.ch05;

public class IeBasic {
    public static void main(String[] args) {
        //if문, 분기문 >> 갈림길을 만들 수 있다.
        //이럴때 이렇게, 저럴때 저렇게 실행이 되었으면 할 때 사용
        int n1 = 5, n2 = 7;

        if(n1 < n2) { // if(true)가 되었을 때만 {} 안의 코드들이 전부 실행된다.
            System.out.printf("%d < %d is %b\n", n1, n2, (n1 < n2));
        }

        if(n1 > n2) { // if(false)가 되었을 때는 {} 안의 코드가 실행되지 않는다.
            System.out.printf("%d > %d is %b\n", n1, n2, (n1 > n2));
        } else {
            System.out.println("false");
        }
        System.out.println("-------------------");

        //if-else 문은 그룹이 되고 둘 중 하나는 무조건 실행된다.
        //if(true) if(){} 안의 코드가 실행
        //if(false) else{} 안의 코드가 실행
        if(n1 == n2) {
            System.out.printf("%d == %d is true\n", n1, n2);
        } else {
            System.out.printf("%d == %d is false\n", n1, n2);
        }

        System.out.println("---  end  ---");
    }
}
