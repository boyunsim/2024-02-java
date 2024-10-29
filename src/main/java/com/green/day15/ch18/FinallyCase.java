package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;

public class FinallyCase {
    public static void main(String[] args) {
        //만약 writer = Files.newBufferedWriter(path); 이때는 문제가 없었고
        //writer.write("FinallyCase"); 이때 예외가 발생이 되었다면
        //writer.close(); 이 문장이 실행이 되지 않는다.
        //그런데 writer.close(); 이문장이 무조건 실행이 되어야 한다.

        Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
        BufferedWriter writer = null;
        try {
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //1. newBufferedWriter가 메소드인지는 (path)소괄호를 보고 알았다.
        //2. static 메소드
        //3. 리턴메소드 - 타입은? BufferedWriter
        //4. 파라미터는 타입은 Path이다.
        //5. throws 메소드이다.
    }
}

class FinallyCase2 {
    public static void main(String[] args) {
        //만약 writer = Files.newBufferedWriter(path); 이때는 문제가 없었고
        //writer.write("FinallyCase"); 이때 예외가 발생이 되었다면
        //writer.close(); 이 문장이 실행이 되지 않는다.
        //그런데 writer.close(); 이문장이 무조건 실행이 되어야 한다.

        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class FinallyCase3 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally { //(실행보장)예외가 발생해도 안해도 ❗❗❗❗❗무조건❗❗❗❗❗ 실행되는 부분
            System.out.println("실행되려나??");
            try {
                if(writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("-- end --");
    }
}