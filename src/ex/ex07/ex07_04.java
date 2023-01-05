package ex.ex07;

import java.util.ArrayList;
import java.util.Arrays;

//@FunctionalInterface
//interface doublenum{Integer doubleup(Integer input_num);}
//
//public class ex07_04 {
//    public static void main(String[] args){
//        int[] numbers = {1, 2, 3, 4, 5};
//        ArrayList<Integer> temp = new ArrayList<>();
//        doublenum dn = (a) -> a*2;
//
//        for (int num : numbers) {
//            if (num % 2 == 1) {  // 홀수이면
//                temp.add(dn.doubleup(num));  // 2를 곱하여 temp에 담는다.
//            }
//        }
//
//        // 정수 리스트를 정수배열로 변환한다.
//        int[] result = new int[temp.size()];
//        for (int i = 0; i < temp.size(); i++) {
//            result[i] = temp.get(i);
//        }
//    }
//}
// 최초에 Lambda를 이용하여 문제를 축소한다고 생각하였으나
// Stream을 이용한다면 코드를 확실히 줄일 수 있을 것이다.

public class ex07_04{
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        int[] temp = Arrays.stream(numbers)
                .filter((a) -> a%2 == 1)
                .map(a -> a*2)
                .toArray()
                ;
    }
}

// 이전에 배우지 않은 map은 각 항목에 대한 접근을 이야기 한다.