package ex.ex09;

import java.util.ArrayList;
import java.util.Scanner;

public class ex09_12 {
    public static void main(String[] args) {
        // Q12. 문자열 압축하기.
        //      문자열 입력받아 문자가 연속적으로 반복되면
        //      반복 횟수를 표시해 문자열을 압축하여 표시하시오.
        Scanner sc = new Scanner(System.in);
        String user_input = sc.nextLine();
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < user_input.length(); i++) {
            temp.add(String.valueOf(user_input.charAt(i)));
        }
        System.out.println(temp);

        ArrayList<String> result = new ArrayList<>();
        int start_index = 0;
        int end_index = start_index + 1;
        String s_result = "";
        try {
            for (int i = 0; i < temp.size(); i++) {
                while (true) {
                    if (temp.get(start_index).equals(temp.get(end_index))) {
                        end_index++;
                    } else {
                        break;
                    }
                }

                result.add(temp.get(start_index));
                result.add(String.valueOf(end_index - start_index));
                System.out.println(result);

                start_index = end_index;
                end_index++;
                System.out.println(start_index);
                System.out.println(end_index);
                System.out.println(result);
                if(end_index >= temp.size()) {
                    end_index = temp.size()-1;
                }
            }
        }
        catch (IndexOutOfBoundsException e) {
            result.add(temp.get(start_index));
            result.add(String.valueOf(end_index - start_index));
            System.out.println(result);
        }
        for (int i = 0; i < result.size(); i++) {
            s_result += result.get(i);
        }
        System.out.println(s_result);

        // try catch문을 이용해서 Index 외의 값을 접근하게 된다면 마지막 부분을
        // 체크하는 경우임으로 마지막으로 수행해야하는 add를 작성해주었다.
        // finally로 해보려 했으나 굳이 finally를 사용하지 않고
        // 오류가 발생한 경우( 마지막 인덱스를 체크하는 경우)에 시행하도록 하였다.
        // Q12 끝.
    }
}
