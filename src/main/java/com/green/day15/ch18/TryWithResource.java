package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
        Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
        try(BufferedWriter writer = Files.newBufferedWriter(path) ; Scanner scan = new Scanner(System.in)) {
            //TryWithResource 는 변수의 스코프를 늘릴 수 없다.
            /*
            AutoCloseable auto = writer;
            auto = scan;
            // 위처럼 작성후 실행시 에러가 나지 않는다면 AutoClosable 인터페이를 상속받은 객체들이다.
            */
            writer.write("FinallyCase");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        /*
            writer.close();
            scan.close();
            위 두가지가 무조건 실행된다.
            AutoClosable 인터페이스를 상속받은 객체만 사용 가능
         */
        System.out.println("-- end --");
    }
}
