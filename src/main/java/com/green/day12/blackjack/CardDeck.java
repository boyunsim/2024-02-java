package com.green.day12.blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards;
    private final String[] patterns;
    private int selectedIdx = 0; //외부에 줘야할 카드의 index값

    public CardDeck() {
        //객체화가 되면 디폴트값을 갖는다.
        cards = new Card[52]; //원래 null인 곳에 주소값이 복사가 되어서 들어 갔다. >> 52개의 각방은 null값이 디폴트로 들어가 있다
        patterns = new String[]{ "Diamond", "Heart", "Club", "Spade" };

        //미션1
        // "", "" 값을 가지고 있는 Card객체를 52개를 만들어주시고
        // cards배열에 하나씩 넣어주세요.


        //미션2
        //모두 다른값을 가지고 있는 Card객체 만들어서 cards에 순차적으로 넣어주세요.
        int idx = 0;
        for(int i=0; i<patterns.length; i++) { //0, 1, 2, 3
            String pattern = patterns[i];
            for(int z=1; z<=13; z++) { // 1~13
                String denomination = getDenomination(z);
                cards[idx++] = new Card(pattern, denomination);

                //cards[idx++] = new Card(patterns[i], getDenomination(z));
            }
        }

        //섞어주세요. (랜덤, 스와핑)
        shuffle();

        //enhanced-for문으로 card객체 주소값 전부 출력
        for(Card c : cards) {
            System.out.println(c);
        }
    }

    private void shuffle() {
        for(int i=0; i<cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length); //0 ~ 51
            Card tmp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = tmp; // 바꿀때는 temp 값에 저장해놓고 돌려버리기
        }
    }

    //주소값 하나씩 리턴, 리턴 주소값 지워야되고, selectedIdx 이용하여 해결
    public Card draw() {
        Card tmp = cards[selectedIdx];
        cards[selectedIdx] = null;
        selectedIdx++;//스와핑이랑 비슷한 작업 >> 지우기 전에 tmp에 옮겨 놓고 지우고 던진다(리턴)!
        return tmp;
    }

    public void checkCard() {
        //enhanced-for문으로 card객체 주소값 전부 출력
        for(Card c : cards) {
            System.out.println(c);
        }
    }

    //n:1 > "A"
    //n:2~10 > 그대로 문자열로 만들어서 2 > "2", 3 > "3"
    //n:11 > "J"
    //n:12 > "Q"
    //n:13 > "K"
    //n:나머지값 > ""

    public String getDenomination(int n) {
        if(n < 1 || n > 13) {
            return "";
        }
        switch(n) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(n);
        }
    }



}