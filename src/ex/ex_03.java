package ex;

import java.util.*;

public class ex_03 {
    public static void main(String[] args){
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
    }

    public static void q1(){
        System.out.print("1번 문제 : ");
        //홍길동의 점수의 평균을 구하라.
        HashMap<String, Integer> Hong = new HashMap<>();
        Hong.put("국어", 80);
        Hong.put("영어", 75);
        Hong.put("수학", 55);

        float result;
        result = ((Hong.get("국어") + Hong.get("영어") + Hong.get("수학"))/Hong.size());
        System.out.println(result);
    }

    public static void q2(){
        System.out.print("2번 문제 : ");
        //13이 홀수인지 짝수인지 판별하라
        Integer temp = new Integer(13);
        if((temp%2) == 1){
            System.out.println("홀수입니다.");
        }
        else{
            System.out.println("짝수입니다.");
        }
    }

    public static void q3(){
        System.out.print("3번 문제 : ");
        //홍길동의 주민등록번호는 881120-1068234 이다. 앞뒤를 나눵 출력하라.
        // 힌트 : substring을 이용하라.
        String Hong_SocialNum = new String("881120-1068234");
        System.out.print("홍길동의 주민번호 앞자리는 " + Hong_SocialNum.substring(0,6));
        System.out.println("  홍길동의 주민번호 뒷자리는 " + Hong_SocialNum.substring(7,Hong_SocialNum.length()));
    }

    public static void q4(){
        System.out.print("4번 문제 : ");
        //홍길동의 주민등록번호는 881120-1068234이다. 성별을 나타내는 숫자를 출력하라.
        String Hong_Socialnum = new String("881120-1068234");
        System.out.println("홍길동의 성별은 "+Hong_Socialnum.substring(7,8));
    }
    public static void q5(){
        System.out.print("5번 문제 : ");
        //문자열 a:b:c:d를 replace함수를 이용하여 a#b#c#d로 출력하라.
        String a = new String("a:b:c:d");
        System.out.println(a.replace(":", "#"));
    }

    public static void q6(){
        System.out.print("6번 문제 : ");
        //[1,3,5,4,2] 리스트를 [5,4,3,2,1]로 정렬하여 출력하라.
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        temp.sort(Comparator.naturalOrder());
        System.out.println(temp);
    }

    public static void q7(){
        System.out.print("7번 문제 : ");
        //['Life', 'is', 'too', 'short'] 리스트를 문자열로 만들어라.
        ArrayList<String> temp = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = new String();
        result = result.join(" ", temp);
        System.out.println(result);
    }

    public static void q8(){
        System.out.print("8번 문제 : ");
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        System.out.println(grade.remove("B"));
    }

    public static void q9(){
        System.out.print("9번 문제 : ");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,3,3,3,4,4,5));
        //중복을 없애라.
        HashSet<Integer> result = new HashSet<>(numbers);
        System.out.println(result);
    }

    enum coffee{
        americano,
        ice_americano,
        cafelatte
    }

    static void printCoffee(coffee type){
        HashMap<coffee, Integer> priceMap = new HashMap<>();
        priceMap.put(coffee.americano, 3000);
        priceMap.put(coffee.ice_americano, 4000);
        priceMap.put(coffee.cafelatte, 5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void q10(){
        System.out.print("10번 문제 : ");
        printCoffee(coffee.americano);
        printCoffee(coffee.ice_americano);
        printCoffee(coffee.cafelatte);
    }
}