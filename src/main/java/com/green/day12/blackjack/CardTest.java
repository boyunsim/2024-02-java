package com.green.day12.blackjack;

import java.util.Arrays;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.getDenomination(1));
        System.out.println(cardDeck.getDenomination(2));
        System.out.println(cardDeck.getDenomination(3));
        System.out.println(cardDeck.getDenomination(10));
        System.out.println(cardDeck.getDenomination(11));
        System.out.println(cardDeck.getDenomination(14));
        System.out.println(cardDeck.getPattern(1));
        System.out.println(cardDeck.getPattern(2));
        System.out.println(cardDeck.getPattern(3));
        System.out.println(cardDeck.getPattern(4));
        System.out.println(cardDeck.getPattern(5));


    }
}
