package com.green.day02;

public class OverFlow {
    public static void main(String[] args) {
        /*
        5리터 컵에 5리터 초과의 물을 넣었을 때, 물이 넘치게 된다.
        이 현상을 오버플로우
        100까지 저장할 수 있는 곳에 101이상을 저장하게 되면 오버플로우
        현상이 나타난다. 다만 현실과는 다르다.

        byte: -128 ~ 127 범위의 값을 저장할 수 있다.

        감사: 너 이거 잘못했네?
        감리: 그럼 이렇게 해결해! -> 감리사 자격증 어렵지만 따뜻하다 (경력 필요)
        정보관리기술사 정보통신기술사 -> 개어려움
        기사 퍼스트, 시나공 -> 기사 준비 (정보처리기사)
         */
        byte var1 = 127;
        System.out.printf("var1 : %d\n", var1);

        byte var2 = (byte)128;
        System.out.printf("var1: %d\n", var2); //128은 127 보다 1이 넘치기 때문에 범위를 돌아서 -128을 표시한다.
                                               //만약 129라면 -127을 표시한다.
    }
}
