package ex.ex09;

import java.util.ArrayList;
import java.util.Scanner;

public class ex09_13 {
    public static void main(String[] args){
        // Q13. Duplicate Numbers
        //      0~9의 문자로 이루어진 숫자를 입력받는다.
        //      이 숫자는 0~9의 숫자가 한번씩만 사용되었는지 체크하는 프로그램을 만들어라.
        Scanner sc = new Scanner(System.in);
        String user_input = sc.nextLine();
        String[] temp;

        temp = user_input.split(" ");
        for(int i = 0 ; i<temp.length;i++) {
            System.out.println(check_arr(temp[i]));
        }

        // 조금 꼬아서 생각했을 수 있지만 비교 가능한 int 배열을 생성하고,
        // 해당 배열은 index 보다 1만큼 작은 값을 가지고 있다.
        // 이후 입력받은 문자열의 각 숫자가 하나씩 등장할 때마다,
        // 그 인덱스에 접근하여 값을 증감한다.
        // 최종적으로 인덱스와 값이 동일하지 않는 경우가 발생하면 문자열에 동일한
        // 숫자가 등장했다는 의미로 문제를 해결하였다.
        // Q13 끝.
    }
    static boolean check_arr(String num){
        int checkarr[] = new int[10];
        for(int i=0; i<10;i++){
            checkarr[i] = i-1;
        }
        for(int i=0; i<num.length();i++) {
            checkarr[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
        }

        for(int i=0; i<checkarr.length;i++) {
            if(checkarr[i] == i){
            }
            else{
                return false;
            }
        }

        return true;
    }
}
