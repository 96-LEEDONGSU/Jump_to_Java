package ex.ex09;

import java.util.Scanner;

public class ex09_05 {
    public static void main(String[] args){
        // Q5. 한 줄 구구단
        //     사용자로 부터 2~9 값을 입력받아 해단 구구단의 결과를 한줄로 출력하시오.
        //     ex ) 2를 입력하면 2 4 6 8 10 12 14 16 18

        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        int user_input = sc.nextInt();

        if(user_input > 9 ) {
            System.out.println("9까지만 입력하시오.");
            return;
        } else if (user_input < 2) {
            System.out.println("2보다 크거나 같은 수를 입력하시오.");
            return;
        }

        for(int i = 1 ; i <= 9; i++){
            System.out.print(i*2 + " ");
        }

        // Q5 끝.
    }
}
