package com.green.day14.ch17;

public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        Printable prn1 = new Prn204Drv();
        Printable prn2 = new Prn731Drv();
        //Prn204Drv d1 = (Prn204Drv)new Prn731Drv(); //예를들어 204에는 3개의 메소드 731에는 2개의 메소드가 있을 때
                                                     //204에만 있는 메소드를 실행할때 731는 그 메소드를 모르기때문에 형변환 못함!!

        prn1.print(myDoc);
        prn2.print(myDoc);

    }
}

class Prn204Drv implements Printable {

    @Override
    public void print(String doc) {
        System.out.println("FROM MD-204 printer");
        System.out.println(doc);
    }


}

class Prn731Drv implements Printable {

    @Override
    public void print(String doc) {
        System.out.println("FROM MD-731 printer");
        System.out.println(doc);
    }


}