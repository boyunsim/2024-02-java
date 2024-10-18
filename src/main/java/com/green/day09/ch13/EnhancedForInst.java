package com.green.day09.ch13;

public class EnhancedForInst {
    public static void main(String[] args) {
        Product[] arr = new Product[4];
        arr[0] = new Product("Star Coffee", 5000);
        arr[1] = new Product("Computer", 1_000_000);
        arr[2] = new Product("Apple", 7_000);
        arr[3] = new Product("Dress", 400_000);

        //미니 미션 아래 포맷처럼 출력되도록 해주세요.
        //System.out.println(arr[0]);//제품명: Coffee, 가격:5000원

        /*
            enhanced-for문을 사용하여 제품명, 가격을 콘솔에 출력하고
            모든 제품의 가격을 더한값을 출력해 주세요.
         */
        int sum = 0;
        for(Product item : arr) {
            System.out.println(item);
        }
        for(Product item : arr) {
            sum += item.getPrice();
        }
        System.out.printf("%,36d원\n",sum);
        System.out.println("--------------------------------------");

        //배열에서 제품명이 Apple인 것만 찾아서 콘솔에 출력
        for(Product item : arr) {
            if(item.getName().equals("Apple")) {
                System.out.println(item);
            }
        }
    }
}

class Product {
    private String name;
    private int price;

    Product (String name, int price) { //생성자,메소드는 클래스의 범위를 넘을 수 없다
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return String.format("제품명: %12s, 가격: %,10d원", name, price);//원칙적으로는 %,d는 프론트에서 찍어주는것이 좋다 (서버(백엔드)는 일을 많이 안해야한다.)
    }
}