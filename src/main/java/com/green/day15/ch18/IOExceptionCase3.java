package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
// * 을 사용해도 무수히 많은 클래스중에 필요한 친구들만 사용한다 >> 이제는 적극사용해도 nice!
//자바는 패키지명에 대문자를 넣지 않는다. 고로 대문자로 시작하는 것은 class명!

//p.402 예제
/*
    D드라이브에 Simple.txt 파일을 만든다.
 */
public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-- end --");
    }
    public static void md1() throws IOException{
        md2();
    }

    public static void md2() throws IOException{
        Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
        BufferedWriter writer = Files.newBufferedWriter(path);
        //1. newBufferedWriter가 메소드인지는 (path)소괄호를 보고 알았다.
        //2. static 메소드
        //3. 리턴메소드 - 타입은? BufferedWriter
        //4. 파라미터는 타입은 Path이다.
        //5. throws 메소드이다.
        writer.write('D');
        writer.write("\n");
        writer.write("점멸");
        writer.close();
    }
}
