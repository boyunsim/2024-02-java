package com.green.day12.blackjack;


import java.util.Arrays;
import java.util.regex.Pattern;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards; //cards에 담기는 객체의 주소값만 변경이 되지 않는다
    private final String[] patterns;
    private final String[] denomenations;

    public CardDeck() {
        cards = new Card[52];
        patterns = new String[]{"Diamond", "Heart", "Clover", "spade"};
        denomenations = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //미션 1 "", "" 값을 가지고 있는 Card객체를 52개를 만들어 주시고
        //cards배열에 하나씩 넣어주세요

        for(int i=0; i<cards.length; i++) {
            for(int z=0; z<cards.length; z++) {
                if(z<14){
                    cards[z] = new Card(getPattern(1), getDenomination(z));
                }
                if(z<27){
                    cards[z] = new Card(getPattern(2), getDenomination(z));
                }
                if(z<40){
                    cards[z] = new Card(getPattern(3), getDenomination(z));
                }
                if(z<53){
                    cards[z] = new Card(getPattern(4), getDenomination(z));
                }

            }
        }
//        for(Card item : cards) {      //이렇게 하면 전부 null이 뜬다
//            item = new Card("","");
//        }

        //enhanced-for문으로 card객체 주소값 전부 출력
        for (Card item : cards) {
            System.out.println(item);
        }
    }
    public String getPattern(int n) {
        if(n>4){
            return "";
        }
        return patterns[n-1];
    }

    public String getDenomination(int n) {
//        if(n>12){
//            return "";
//        }
        return denomenations[(n%12)-1];
    }

}
