package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        //점의 위치값을 리터럴 사용 금지.
        //fileNm에서 jpg문자열을 뽑아내주세요.
        String fileNm = "nice_Very.Nice.jpg";

        String ext = fileNm.substring(fileNm.lastIndexOf("j")); //jpg 확장자가 아니면 확장자를 찾지 못함
        String ext2 = fileNm.substring(fileNm.lastIndexOf(".") + 1); //확장자 찾는거면 이게 맞음

        System.out.println(ext);
        System.out.println(ext2);
    }
}
