package ex.ex09;

import java.util.Arrays;

public class ex09_01 {
    public static void main(String[] args){
        // Q1. 문자열 바꾸기
        //     "a:b:c:d" 문자열을 split과 join을 이용하여 a#b#c#d로 변경하시오.
        String temp = new String("a:b:c:d");
        System.out.println(String.join("#", temp.split(":")));
        // Q1 끝.
    }
}
