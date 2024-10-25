package com.green.day12.blackjack;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("============ Blakcjack ============");
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();
        Gamer gamer = new Gamer();
        Scanner scan = new Scanner(System.in);

        //번갈아 가면서 게이머와, 딜러가 2장의 카드를 받을 수 있게 해주세요
        for (int i = 0; i<2; i++) {
            dealer.receiveCard(cd.draw());
            gamer.receiveCard(cd.draw());
        }

        //딜러가 16점 이하면 카드를 한장 더 받을 수 있도록 해주세요.
        dealer.needMoreCard(cd);
        dealer.needMoreCard(cd);
        dealer.needMoreCard(cd);

        while(true) {
            System.out.println("---------------");
            gamer.showYourCards();
            System.out.print("카드를 추가하시겠습니까(취소: n) ");
            String input = scan.nextLine();

            //input 문자열에 있는 값이 "n"이면 반복문을 종료하고 싶다.
            if(input.equalsIgnoreCase("n")) {
                break;
            }
            //게이머가 카드 한장 더 받는다.
            gamer.receiveCard(cd.draw());
        }
        dealer.showYourCards();
        rule.getWinner(dealer,gamer);

//        for(int i=0; i<9; i++){
//            dealer.needMoreCard(cd);
//            if(gamer.point <=21) {
//                gamer.receiveCard(cd.draw());
//            }
//        }


//        System.out.println("----------");
//        dealer.showYourCards();
//        System.out.println("----------");
//        gamer.showYourCards();
//        System.out.println("----------");
//        System.out.println("dealer: " + dealer.point);
//        System.out.println("gamer: " + gamer.point);
//        rule.getWinner(dealer, gamer);
    }
}
