package ex.ex07;

import java.util.Arrays;

public class ex07_05 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, 5, 8, -3};
        // 정수 배열에서 음수를 모두 제거하라.
        // 함수형 프로그래밍을 이용하라.
        int[] result = Arrays.stream(numbers)
                .filter(a -> a > 0)
                .toArray();
    }
}
