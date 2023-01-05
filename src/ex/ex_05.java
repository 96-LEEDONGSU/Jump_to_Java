package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class ex_05 {
    public static void main(String[] args){
        //Q1. ex.UpgradeCalculator
        //    기존 클래스를 상속받는 upgradecalculator 생성하고
        //    값을 뺄수있는 기능을 가지도록 생성하라.
        System.out.printf("Q1.");
        UpgradeCalculator cal1 = new UpgradeCalculator();
        cal1.add(10);
        cal1.minus(3);
        System.out.println(cal1.getValue());  // 10에서 7을 뺀 3을 출력
        // Q1 끝.

        //Q2. ex.MaxLimitCalculator
        //    객체변수 value가 100보다 큰 값을 가질 수 없도록 제한하는 클래스를 생성하라.
        //    ex.Calculator 클래스를 상속하여 ex.MaxLimitCalculator 클래스를 생성하라.
        System.out.printf("Q2.");
        MaxLimitCalculator cal2 = new MaxLimitCalculator();
        cal2.add(50);  // 50 더하기
        cal2.add(60);  // 60 더하기
        System.out.println(cal2.getValue());  // 100 출력
        // Q2 끝.

        //Q3. 홀수 짝수 판별하기
        //    주어진 정수가 홀수인지 짝수인지 판별하는 ex.Calculator 클래스를 작성하시오.
        //    홀수이면 true, 짝수이면 false를 리턴하라.
        System.out.printf("Q3-1.");
        Calculator cal3 = new Calculator();
        System.out.println(cal3.isOdd(3));
        System.out.printf("Q3-2.");
        System.out.println(cal3.isOdd(4));
        // Q3 끝.

        //Q4. 평균값을 구하는 메서드
        //    정수 배열 또는 정수 리스트를 넘겨주면 평균을 리턴하는 ex.Calculator 클래스를 작성하시오.
        System.out.printf("Q4-1.");
        int[] data1 = {1, 3, 5, 7, 9};
        Calculator cal4 = new Calculator();
        int result1 = cal4.avg(data1);
        System.out.println(result1);  // 5 출력

        System.out.printf("Q4-2.");
        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator cal4_1 = new Calculator();
        int result2 = cal4_1.avg(data2);
        System.out.println(result2);  // 5 출력
        // Q4. 끝.

        //Q5. 리스트와 객체
        //    프로그램의 출력결과를 예측하고 이유를 설명하시오.
        /*
            import java.util.ArrayList;
            import java.util.Arrays;

            public class Sample {
                public static void main(String[] args) {
                    ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
                    ArrayList<Integer> b = a;
                    a.add(4);
                    System.out.println(b.size());
                }
            }
         */
        // 출력 예측 결과는 4이다.
        // 이유는 객체 그 자체를 넘겨 b 객체는 a를 설정할 수 있게 되어 a에 삽입한 값이 b에서 조회해도 동일한
        // 결과를 가져오기 때문이다.

        // Q4 끝.

        // Q5. 생성자와 초기값
        //     ex.Calculator 객체를 생성하고 값을 더하여 결과를 출력하는 객체를 생성한 코드이다.
        //     오류를 수정하시오.
        /*
        class ex.Calculator {
            Integer value;
            void add(int val) {
                this.value += val;
            }

            public Integer getValue() {
                return this.value;
            }
        }

        public class Sample {
            public static void main(String[] args) {
                ex.Calculator cal = new ex.Calculator();
                cal.add(3);  // 여기서 NullPointerException 이 발생한다.
                System.out.println(cal.getValue());
            }
        }
         */
        // ex.Calculator 클래스의 객체변수 value의 자료형을 int로 변경해야한다.
        // 객체변수의 자료형은 Integer인데, 메소드를 이용하여 넘겨주는 3의 자료형은 int라서 오류가 발생한다.

        // Q6 끝.

        // Q7. 인터페이스 사용하기.
        //     주어진 ex.MineralCalculator 클래스와 사용법을 확인하라.
        //     MaineralCalculator 클래스는 광물의 종류가 추가될 때 마다 add 메서드의 매개변수를
        //     바꿔가며 추가해야한다. 광물이 추가되어도 클래스를 변경하지 않는 방향으로 코드를 수정하라.
        System.out.printf("Q7.");
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
        // ex.MineralCalculator 클래스를 변경하지 않도록 수정해야한다. 그러나
        // 각각의 광물에 메소드를 생성하는 방식으로 해도 되는데 이거나 저거나 아닌가?
        // 인터페이스의 사용목적 : 다양한 클래스가 상속받는 클래스에 독립적으로 분리되도록 해야한다.
        // 아무튼 사용목적에 따라 각 클래스에 메소드를 생성해야하나 그러지 아니하였다.
        // Q7 끝.

        // Q8. 오류 찾기 1
        //     주어진 코드를 보고 1, 2, 3, 4, 5번 문장 중에 오류가 발생하는 문자을 모두 찾고,
        //     오류의 원인을 설명하시오.
        /*
        interface Predator {
        }

        class Animal {
        }

        class Dog extends Animal {
        }

        class Lion extends Animal implements Predator {
        }

        public class Sample {
            public static void main(String[] args) {
                Animal a = new Animal();  // 1번
                Animal b = new Dog();  // 2번
                Animal c = new Lion();  // 3번
                Dog d = new Animal();  // 4번
                Predator e = new Lion();  // 5번
            }
        }
        */
        // IS-A 관계를 파악하는 것으로 보인다.
        // 1번 : Animal is a Animal.
        // 2번 : Dog is a Animal.
        // ... 이렇게 확인해보면 Animal is a Dog. (4번) 문장과 같이 이상한 문장이 등장한다.
        // Animal 클래스는 부모클래스이며, Dog 클래스가 자식클래스이다. 그러므로 상속관계가 거꾸로
        // 작성되어있어 오류가 발생한다.

        // Q8 끝.

        // Q9. 오류 찾기 2
        //     주어진 코드를 보고 1, 2, 3, 4, 5번 문장 중에 오류가 발생하는 문자을 모두 찾고,
        //     오류의 원인을 설명하시오.
        /*
        interface Predator {
            String bark();
        }

        abstract class Animal {
            public String hello() {
                return "hello";
            }
        }

        class Dog extends Animal {
        }

        class Lion extends Animal implements Predator {
            public String bark() {
                return "Bark bark!!";
            }
        }

        public class Sample {
            public static void main(String[] args) {
                Animal a = new Lion();
                Lion b = new Lion();
                Predator c = new Lion();

                System.out.println(a.hello());  // 1번
                System.out.println(a.bark());   // 2번
                System.out.println(b.hello());  // 3번
                System.out.println(b.bark());   // 4번
                System.out.println(c.hello());  // 5번
                System.out.println(c.bark());   // 6번
            }
        }
         */
        // Animal a = new Lion(); 의 의미는 Animal 객체로 생성한 a는 Lion이라는 클래스의 자료형을 가진다.?
        // 그러므로 a는 Animal 클래스가 가지고 있는 hello()메소드를 사용할 수 있다.
        // 그러나 Lion 클래스가 가진 bark() 메소드는 접근이 불가능하다.
        // b는 Lion 클래스로 생성된 객체이다. Lion은 Animal을 상속받고, Predator 인터페이스를 가진다.
        // 그러므로 bark()메소드를 사용할 수 있고, Animal을 상속받음으로 hello() 메소드에도 접근가능하다.
        // c는 Predator 인터페이스로 생성된 객체이다. 그러므로 bark() 메소드는 사용가능하지만, Animal에 작성된
        // hello() 메소드에는 접근이 불가능하다.
        // Q9 끝.
    }
}

interface Mineral{
    void add(Mineral mineral);
}

class Gold extends MineralCalculator{
}

class Silver extends MineralCalculator{
}

class Bronze extends MineralCalculator{
}

class MineralCalculator implements Mineral {
    int value = 0;

    public int getValue() {
        return this.value;
    }

    public void add(Mineral mineral) {
        if(mineral instanceof Gold){
            this.value += 100;
        } else if (mineral instanceof  Silver) {
            this.value += 90;
        } else if (mineral instanceof  Bronze) {
            this.value += 80;
        }
    }
}

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int temp){
        return temp % 2 != 1;
    }

    int avg(ArrayList temp_arr){
        int result = 0;
        for(int i=0;i<temp_arr.size();i++){
            result += (int)temp_arr.get(i);
        }
        return result/ temp_arr.size();
    }

    int avg(int[] temp_arr){
        int result = 0;
        for(int i=0;i<temp_arr.length;i++){
            result += (int)temp_arr[i];
        }
        return result/ temp_arr.length;
    }
}

class UpgradeCalculator extends Calculator{
    void minus(int val){
        this.value = this.value - val;
    }
}

class MaxLimitCalculator extends Calculator{
    int getValue(){
        if (this.value > 100) {
            this.value = 100;
        }
        return this.value;
    }
}