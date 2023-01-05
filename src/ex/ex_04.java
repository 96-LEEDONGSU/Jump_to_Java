package ex;

public class ex_04 {
    public static void main(String[] args){
        q1();
        q2();
        q3();
        q4();
        q5();
    }
    public static void q1(){
        // Q1. 출력결과를 예상하시오.
        //출력 예상 : everywhere
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
    }
    public static void q2(){
        // Q2. 3의 배수의 합
        // while문을 사용해 1부터 1000까지 자연수 중 3의 배수의 합을 구하는 프로그램을 작성하시오.
        int temp = 1;
        int result = 0;
        while(temp < 1001){
            if(temp%3 == 0){
                result = result + temp;
            }
            temp++;
        }
        System.out.println(result);
    }

    public static void q3(){
        // Q3. 별 표시하기
        // n번째 줄은 n개의 별을 그리는 프로그램을 작성하시오.
        // 5줄까지 그리시오.
        for(int i = 0; i<5 ; i++){
            for(int j = 0; j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void q4(){
        // Q4. 1부터 100까지 출력하기.
        // for문을 이용해 1부터 100까지의 숫자를 출력하시오.
        for(int i = 0; i<100;i++){
            System.out.print(i+1 + " ");
        }
        System.out.println();
    }

    public static void q5(){
        // Q5. 평균점수 구하기
        // marks에 10명의 학생 중간고사 점수를 준다.
        // for each문을 이용하여 평균 점수를 구하시오.
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        for(int a : marks){
            sum = sum + a;
        }
        System.out.println(sum/ marks.length);
    }
}
