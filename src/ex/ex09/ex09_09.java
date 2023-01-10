package ex.ex09;

public class ex09_09 {
    public static void main(String[] args){
        // Q9. Calculator 클래스 작성하기
        //     다음과 같이 동작하는 Calculator 클래스를 작성하시오.
        /*
        public class Sample {
            public static void main(String[] args) {
                int[] data1 = {1,2,3,4,5};
                Calculator cal1 = new Calculator(data1);
                System.out.println(cal1.sum()); // 15 출력
                System.out.println(cal1.avg()); // 3.0 출력

                int[] data2 = {6,7,8,9,10};
                Calculator cal2 = new Calculator(data2);
                System.out.println(cal2.sum()); // 40 출력
                System.out.println(cal2.avg()); // 8.0 출력
            }
        }
         */
        int[] data1 = {1,2,3,4,5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력

        int[] data2 = {6,7,8,9,10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력

        // Q9 끝.
    }

    private static class Calculator {
        int[] data;
        int result = 0;
        Calculator(int[] input){
            this.data = input;
        }

        int sum(){
            for(int i = 0; i<this.data.length; i++){
                this.result = result + this.data[i];
            }
            return this.result;
        }

        float avg(){
            float result_avg = 0;
            result_avg = this.result/this.data.length;
            return result_avg;
        }
    }
}
