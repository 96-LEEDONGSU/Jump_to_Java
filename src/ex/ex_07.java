package ex;

import java.util.ArrayList;

public class ex_07 {
    public static void main(String[] args) {
        // Q1. 패키지 오류 수정하기
        // 다음처럼 house로 정의된 클래스가 있다.
                        /*
                        ==============================================================================
                        package house;

                        public class HousePark {
                            protected String lastname = "park";

                            public String getLastname() {
                                return this.lastname;
                            }
                        }
                        ==============================================================================
                         */

        // sample 클래스에서 HousePark 클래스를 사용하려 한다.

                        /*
                        ==============================================================================
                            import HousePark;

                            public class Sample {
                                public static void main(String[] args) {
                                    HousePark housePark = new HousePark();
                                    System.out.println(housePark.getLastname());
                                }
                            }
                        ==============================================================================
                        */

        // 위와 같이 작성하면 HousePark 클래스를 찾을 수 없다. import문을 수정하라.

        // > import house.HousePark
        // 이와 같이 수정하면 오류가 없어진다. 패키지가 다름으로 패키지에 클래스를 import해야한다.

        // Q1 끝.


        // Q2. 예외처리
        // 다음 코드의 실행 결과를 예측하고 그 이유에 대해 설명하시오.
                        /*
                        ==============================================================================
                        import java.util.ArrayList;
                        import java.util.Arrays;

                        public class Sample {
                            public static void main(String[] args) {
                                int result = 0;
                                try {
                                    int[] a = {1, 2, 3};
                                    int b = a[3];
                                    ArrayList c = new ArrayList(Arrays.asList("3"));
                                    int d = (int) c.get(0);
                                    int e = 4 / 0;
                                } catch (ClassCastException e) {
                                    result += 1;
                                } catch (ArithmeticException e) {
                                    result += 2;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    result += 3;
                                } finally {
                                    result += 4;
                                }
                                System.out.println(result); // result 의 값은 무엇일까?
                            }
                        }
                        ==============================================================================
                         */
        // a[3]은 OutOfBounds이다. 그러므로 result += 3; 진행하고 finally는 무조건 실행함으로
        // result += 4;를 진행함으로 result는 7이다.
        // 결과적으로 7.

        // Q2 끝.


        // Q3. 스레드 적용하기
        // HeavyWork 클래스의 work 메서드를 4번 수행하는 예제이다.
                        /*
                            class HeavyWork {
                            String name;

                            HeavyWork(String name) {
                                this.name = name;
                            }

                            public void work() {
                                for (int i = 0; i < 5; i++) {
                                    try {
                                        Thread.sleep(100);  // 0.1 초 대기한다.
                                    } catch (Exception e) {
                                    }
                                }
                                System.out.printf("%s done.\n", this.name);
                            }
                        }

                        public class Sample {
                            public static void main(String[] args) {
                                long start = System.currentTimeMillis();
                                for (int i = 1; i < 5; i++) {
                                    HeavyWork w = new HeavyWork("w" + i);
                                    w.work();
                                }
                                long end = System.currentTimeMillis();
                                System.out.printf("elapsed time:%s ms\n", end - start);
                            }
                        }
                         */
        // 수행결과는 w1, w2, w3, w4 done 순서로 나타다며 0.5초 정도 소요된다.
        // work 메서드는 4번 수행하면 대략 2초가 소요되는데 스레드를 이용하면
        // 수행시간을 단축할 수 있다.
        // 스레드를 이용하여 프로그램을 작성하시오.
        // 풀이는 새로운 클래스로 생성하여 풀었다. ex07_03 참고
        // Q3 끝.

        // Q4. 홀수에만 2를 곱하여 리턴하기.
                        /*
                        import java.util.ArrayList;

                        public class Sample {
                            public static void main(String[] args) {
                                int[] numbers = {1, 2, 3, 4, 5};
                                ArrayList<Integer> temp = new ArrayList<>();
                                for (int num : numbers) {
                                    if (num % 2 == 1) {  // 홀수이면
                                        temp.add(num * 2);  // 2를 곱하여 temp에 담는다.
                                    }
                                }

                                // 정수 리스트를 정수배열로 변환한다.
                                int[] result = new int[temp.size()];
                                for (int i = 0; i < temp.size(); i++) {
                                    result[i] = temp.get(i);
                                }
                            }
                        }
                         */
        // 해당 코드를 함수형 프로그래밍을 이용하여 표현하라.
    }
}