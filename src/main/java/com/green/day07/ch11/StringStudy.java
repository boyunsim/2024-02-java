package com.green.day07.ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";

        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = str1 + str2;
        System.out.println(str4);

        String str5 = str2.concat(str1);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println(str5);

        System.out.println("-----------------------------");
        String str6 = "abcdefghijklmn";
        System.out.println("str.substring(3): "
                           + str6.substring(3)); //파일명에서 확장자 추출할 때 사용
        System.out.println("str6.substring(4, 7): "
                           + str6.substring(14)); // 4, 5 ,6자리의 문자열을 리턴

        String fileNm = "nice_Very.Nice.jpg";
        System.out.println(".의 위치값: " + fileNm.indexOf("."));
        //왼쪽에서 오른쪽 방향으로 가장 빨리 찾은 index값을 리턴

        System.out.println("마지막 .의 위치값: " + fileNm.lastIndexOf("!"));
        //오른쪽에서 왼쪽 방향으로 가장 빨리 찾은 index값을 리턴

        System.out.println("-----------------------------");

        String str7 = "LExi";
        String str8 = "Lexi";

        System.out.println(str7.equals(str8));
        System.out.println(str7.compareTo(str8));
        System.out.println(str7.compareTo("LExi")); // 0이 나오면 같은 문자열이다.
        System.out.println(str7.equalsIgnoreCase(str8)); // 대소문자 가리지 않고 비교

        System.out.println("-----------------------------");

        int n = 10;
        String str9 = n + "";
        String str10 = String.valueOf(n);
        System.out.println(str10 + 10);

        System.out.println("-----------------------------");

        String str11 = "abcdefgcd";
        String str11Result = str11.replace("cd", "CD");
        System.out.println("str11Result: " + str11Result);
    }
}
