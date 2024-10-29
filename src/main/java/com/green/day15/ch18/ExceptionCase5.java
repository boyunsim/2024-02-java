package com.green.day15.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.printf("a/b ... a? ");
            int n1 = scan.nextInt();
            System.out.printf("a/b ... a? ");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d \n", n1, n2, (n1 / n2));
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Exception 을 가장 위에 작성하면 아래의 친구들이 바보가 되기 때문에 항상 가장 아래 catch 문에 작성해야한다.
        }

        System.out.println("---------------------------- (2)");

        try {
            System.out.printf("a/b ... a? ");
            int n1 = scan.nextInt();
            System.out.printf("a/b ... a? ");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d \n", n1, n2, (n1 / n2));
        } catch (InputMismatchException | ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------- (3)");

        try {
            System.out.printf("a/b ... a? ");
            int n1 = scan.nextInt();
            System.out.printf("a/b ... a? ");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d \n", n1, n2, (n1 / n2));
        } catch (Exception e) { //Exception 모든 예외를 잡을 수 있다. 예외의 최상위 class
                                //(Exception 위에 Throwable 이 있지만 실무에서는 안쓰기 때문에 최상위로 생각해도 된다)
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
