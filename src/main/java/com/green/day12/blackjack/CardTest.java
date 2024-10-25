package com.green.day12.blackjack;

import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.checkCard();
        System.out.println("-------------------------");
        Card c = cd.draw();
        System.out.println(c);
        System.out.println("-------------------------");
//        Card c2 = cd.draw();
//        System.out.println(c2);
        cd.checkCard();
    }
}
class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); //카드를 저장한다
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        System.out.println("--------------");

        gamer.showYourCards();
        System.out.printf("point: %d",gamer.getPoint()); //point 값이 출력될 수 있도록 하시오.
        List<Card> list = gamer.openCards();
    }
}

class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.needMoreCard(cd);
        dealer.needMoreCard(cd);
        dealer.needMoreCard(cd);
        dealer.needMoreCard(cd);
        System.out.println("------------------");
        dealer.showYourCards();


    }
}
class CardTest4 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Rule r = new Rule();
        Gamer gamer = new Gamer();
        dealer.needMoreCard(cd);
        dealer.needMoreCard(cd);
        dealer.needMoreCard(cd);
        dealer.needMoreCard(cd);
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        System.out.println("------------------");
        dealer.showYourCards();
        System.out.println("------------------");
        gamer.showYourCards();
        System.out.println("dealer: " + dealer.point);
        System.out.println("gamer: " + gamer.point);
        r.getWinner(dealer, gamer);


    }
}

class CardTest5 {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Rule r = new Rule();
        Gamer gamer = new Gamer();
        r.getWinner(dealer,gamer);
    }
}
