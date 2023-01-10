package ex.ex09;

import java.util.Random;

class OddException extends Exception{
}
public class ex09_10 {
    static void execute(int n) throws OddException{
        System.out.printf("입력 숫자: %d\n", n);
        if (n % 2 == 1) {  // 홀수이면 OddException이 발생한다.
            //throw new OddException();
        }
        System.out.println("짝수입니다.");
    }
    public  static void main(String[] args) throws OddException {
        // Q10. 오류에 상관없이 모두 수행하기
        //      Random 클래스를 이용하여 0~10 사이의 숫자를 무작위 생성하여
        //      숫자를 execute 함수를 10회 호출한다.
        //      execute 함수는 입력 숫자가 짝수면 짝수입니다. 홀수인 경우엔 OddException을 발생시킨다.
        //      10회의 execute 메서드 호출 시 입력 값이 홀수인 경우 프로그램이 즉시 종료한다.
        //      OddException이 발생해도 프로그램이 종료되지 않고 진행하도록 수정하시오.

        Random r = new Random();
        int i = 0;
        try {
            for (; i < 10; i++) {
                execute(r.nextInt(10));
            }
        } catch (OddException e) {
            e.printStackTrace();
        }
        //그냥 오류가 발생하지 않게 execute 함수의 throw를 제거하면 되는 것이 아닌가?

        // Q10 끝.
    }
}
