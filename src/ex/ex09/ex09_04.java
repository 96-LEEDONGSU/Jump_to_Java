package ex.ex09;

import java.util.ArrayList;
import java.util.Scanner;

public class ex09_04 {
    public static void main(String[] args){
        // Q4. 피보나치 수열
        //     첫번째 항의 값이 0이고, ... 피보나치 수열이 존재하다.
        //     정수 n을 입력받고, n항 이하의 피보나치 수열을 출력하라.
        ArrayList<Integer> Fibonacci = new ArrayList<>();
        Fibonacci.add(0);
        Fibonacci.add(1);

        Scanner sc = new Scanner(System.in);

        System.out.print(">"); // 교수님이 세계의 평화를 위해 잘 작성하라 했던 입력 창..
        int user_input = sc.nextInt();

        for(int i = 2; i<user_input; i++){
            Fibonacci.add(Fibonacci.get(i-2) + Fibonacci.get(i-1));
        }

        for(int i = 0 ; i<user_input; i++){
            System.out.print(Fibonacci.get(i) + ", ");
            // 마지막에 반점을 찍지 않도록 해야한다.
        }


        // Q4 끝.
    }
}
