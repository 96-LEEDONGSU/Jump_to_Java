package ex.ex09;

import java.util.Scanner;

public class ex09_06 {
    public static void main(String[] args) {
        // Q6. 입력 숫자의 총합 구하기
        //     사용자에게 여러 숫자를 입력받아 숫자의 총합을 구하시오.
        //     사용자의 입력은 숫자를 반점으로 구분하여 입력한다.
        Scanner sc = new Scanner(System.in);
        String user_input = sc.nextLine();
        String[] result = user_input.split(",");
        int sum_all = 0;
        for(int i = 0; i<result.length; i++){
            sum_all += Integer.parseInt(result[i]);
        }

        System.out.println(sum_all);
        // Q6 끝.
    }
}
