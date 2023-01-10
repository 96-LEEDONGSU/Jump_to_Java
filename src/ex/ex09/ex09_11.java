package ex.ex09;

import java.util.ArrayList;
import java.util.Scanner;

public class ex09_11 {
    public static void main(String[] args){
        // Q11. DashInsert
        //      DashInsert 메서드는 숫자로 구성된 문자열을 입력받은 뒤
        //      문자열 안에서 홀수가 연속되면 두 수 사이에 -를 추가하고,
        //      짝수가 연속되면 *을 추가하는 기능을 가진다. 메서드를 완성하시오.
        Scanner sc = new Scanner(System.in);
        String user_input = sc.nextLine();
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 0; i<user_input.length();i++) {
            temp.add((Character.toString(user_input.charAt(i))));
        }
        temp_class tc = new temp_class();
        System.out.println(tc.dashinsert(temp));

        // Q11 끝.
    }

    static class temp_class{
        ArrayList<String> dashinsert(ArrayList<String> temp){
            for(int i = 0; i<temp.size();i++){
                if(i+1 >= temp.size()) break;
                if ((Integer.parseInt(temp.get(i)) %2 == 1) && (Integer.parseInt(temp.get(i+1)) %2 == 1)){
                    temp.add(i+1, "-");
                    i += 1;
                } else if ((Integer.parseInt(temp.get(i)) %2 == 0) && (Integer.parseInt(temp.get(i+1)) %2 == 0)) {
                    temp.add(i+1, "*");
                    i += 1;
                }
            }
            return temp;
            // 처음엔 if문을 그냥 2개 사용해서 마지막 2개에 대한 홀수 또는 짝수를 판단하지 못했다.
            // if-elseif 문을 사용하면 됐다는걸 2일에 걸쳐 알게되었다.
        }
    }
}
