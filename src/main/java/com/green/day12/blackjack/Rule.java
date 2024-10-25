package com.green.day12.blackjack;

public class Rule {
    public void getWinner(Dealer dealer, Gamer gamer) {
        //1. 각 게이머(게이머, 딜러)의 점수를 얻을 수 있어야 한다.
        //2. 값을 비교해서 누가 이겼는지 출력
        //3. 비겼다 or 누가 이겼다.

        //비긴 경우: 둘의 값이 같을 경우, 둘 다 21을 넘어선 경우
        /*
            if:비기는 경우의 수를 전부 잡아냄. 둘의 값이 같거나 둘다 21을 넘은 경우
            남은경우: 둘중의 하나가 21을 넘은 경우 || 둘다 21을 안 넘은 경우

            else if: 딜러가 이긴 경우의 수를 전부 잡아냄. 딜러가 21을 안 넘으면서 게이머보다 점수가 높은경우
                     게이머만 21을 넘은 경우 (if에서 둘다 넘은건 체크했기 때문에 딜러가 21을 안넘은 경우는 안적어도 된다!)

            else: 남은 경우는 게이머가 이기는 경우의 수 밖에 없어서 else로 처리
        */
        if(dealer.point == gamer.point || (dealer.point>21 && gamer.point>21)) {
            System.out.println("비겼다.");
        } else if (dealer.point > gamer.point && (dealer.point<=21) || /*(dealer.point<=21 &&*/ gamer.point>21/*)*/) {
            System.out.println("dealer가 이겼다.");
        } else /*if (gamer.point > dealer.point && (gamer.point<=21) || (dealer.point>21 && gamer.point<=21))*/ {
            System.out.println("gamer가 이겼다.");
        }
    }
}
