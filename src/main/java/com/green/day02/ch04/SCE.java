package com.green.day02.ch04;

public class SCE {
    public static void main(String[] args) {
        int n1 = 0 , n2 = 0;
        boolean result;
        result = ((n1 += 10) < 0) && ((n2 += 10) > 0);
        System.out.println("result: " + result);
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2); // 연산이 실행되지 않아서 값이 변경이되지 않았다
        //n1 < 0 : false이기 때문에 ((n2 += 10) > 0) 실행되지 않는다.
        // && 연산자는 왼쪽항이 false면 오른쪽항 연산을 하지 않고 false를 리턴한다.
        // || 연산자는 왼쪽항이 true면 오른쪽항 연산을 하지 않고 true를 리턴한다고 유추할 수 있다.

        int n3 = 0, n4 = 0;
        result = ((n3 += 10) > 0) || ((n4 += 10) > 0);
        System.out.println("n3: " + n3);
        System.out.println("n4: " + n4);
        // || 연산자는 왼쪽항이 true면 오른쪽항 연산을 하지 않고 true를 리턴한다고 유추한 것이 사실인 것을 확인했다.
    }
}
