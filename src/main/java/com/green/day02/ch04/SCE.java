package com.green.day02.ch04;

public class SCE {
    public static void main(String[] args) {
        /*
            &&연산자는 false 가 될 확률이 높은 연산을 왼쪽 배치하는게 유리
            ||연산자는 true 가 될 확률이 높은 연산을 왼쪽 배치하는게 유리
         */
        int n1 = 0 , n2 = 0;
        boolean result;
        result = ((n1 += 10) < 0) && ((n2 += 10) > 0);
        System.out.println("result: " + result);
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2); // 연산이 실행되지 않아서 값이 변경이되지 않았다
        //n1 < 0 : false 이기 때문에 ((n2 += 10) > 0) 실행되지 않는다.
        // && 연산자는 왼쪽항이 false 면 오른쪽항 연산을 하지 않고 false 를 리턴한다.
        // || 연산자는 왼쪽항이 true 면 오른쪽항 연산을 하지 않고 true 를 리턴한다고 유추할 수 있다.

        int n3 = 0, n4 = 0;
        result = ((n3 += 10) > 0) || ((n4 += 10) > 0);
        System.out.println("n3: " + n3);
        System.out.println("n4: " + n4);
        // || 연산자는 왼쪽항이 true 면 오른쪽항 연산을 하지 않고 true 를 리턴한다고 유추한 것이 사실인 것을 확인했다.
    }
}
