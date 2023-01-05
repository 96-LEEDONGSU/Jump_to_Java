package ex.ex09;

import java.util.HashMap;
import java.util.HashSet;

public class ex09_02 {
    public static void main(String[] args){
        // Q2. 맵에서 값 추출하기
        //     HashMap 자료형에서 해당하는 key가 없는 경우 null 대신 70을 얻도록 하라.

            /*
            import java.util.HashMap;

            public class Sample {
                public static void main(String[] args)  {
                    HashMap<String, Integer> a = new HashMap<>();
                    a.put("A", 90);
                    a.put("B", 80);
                    System.out.println(a.get("C"));  // null 출력
                }
            }
             */
        // 굳이 코드를 작성하지 않아도 default를 사용하라는 의미임을 파악할 수 있다.
        HashMap<String, Integer> temp = new HashMap<>();
        temp.put("A", 90);
        temp.put("B", 80);
        System.out.println(temp.getOrDefault("C", 70));
        // getOrDefault 메소드를 이용하면 Key값이 없을 때, 뒤의 defaultValue 파라미터의 값을
        // 리턴하도록 할 수 있다.

        // Q2 끝.
    }
}
