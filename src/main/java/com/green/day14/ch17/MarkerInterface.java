package com.green.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {
        Report0 r0 = new Report0("Simple Funny News~");
        Report1 r1 = new Report1();
        Report2 r2 = new Report2();
        Report3 r3 = new Report3();

        Printer p = new Printer();
        p.printContents(r0);
        p.printContents(r1);
        p.printContents(r2);
        p.printContents(r3);

    }
}

interface Printable2 {
    String getContents();
}
interface Upper {}
interface Lower {}

class Report0 implements Printable2 {//interface상속은 다중상속 가능
    private String contents;

    Report0(String contents) {
        this.contents = contents;
    }

    @Override
    public String getContents() {
        return contents;
    }
}

class Report1 implements Printable2, Lower{
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Report2 implements Printable2, Upper{
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Report3 implements Printable2, Lower, Upper{
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Printer {
    public void printContents(Printable2 doc) {
        if(doc instanceof Upper) {
            System.out.println(doc.getContents().toUpperCase());
        }else if(doc instanceof Lower) {
            System.out.println(doc.getContents().toLowerCase());
        }else {
            System.out.println(doc.getContents());
        }
    }
}