package ex.ex09;

public class ex09_03 {
    public static void main(String[] args){
        // Q3. 50점 이상 점수의 총합 구하기.

        //     A학급의 학생 점수를 가진 정수 배열이 있다. 50점 이상의 점수들에 한해 총합을 구하시오.
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};

        int result = 0;
        for(int score : A){
            if(score >= 50){
                result = result + score;
                // result += score; 위와 동
            }
        }
        System.out.println(result);

        // Q3 끝.
    }
}
