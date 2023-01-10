package ex;

import java.io.*;
import java.util.ArrayList;

public class ex_06 {
    public static void main(String[] args) throws IOException {
        // Q1. 입력 숫자의 합
        //     두 개의 숫자를 입력받아 합을 출력하라.

//        Scanner sc1 = new Scanner(System.in);
//        int a = sc1.nextInt();
//        int b = sc1.nextInt();
//        int result = a + b;
//        System.out.println(result);

        // 사용자 입력을 대기함으로 다음 문제를 풀기위해 주석처리

        // Q1 끝.


        // Q2. 대문자로 변경하기.
        //     영문을 입력하고 엔터를 입력하면 영문을 대문자로 변경하라.
        //     사용자가 END라는 문자열을 입력하기 전까지 반복해서 입력을 받도록 하라.

//        Scanner sc2 = new Scanner(System.in);
//        String temp_user = "";
//        while(true) {
//            temp_user = sc2.nextLine();
//            if(temp_user.equals("END")) break;
//            System.out.println(temp_user.toUpperCase());
//        }

        // Q2 끝.


        // Q3. 오류 수정하기
        //     sample.txt 파일에 "Write once, run anywhere"라는 문자열을 저장하고
        //     다시 파일을 읽어서 출력하는 코드이다. 출력이 예상대로 나오지 않는다 오류를 수정하라.

        /*
        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;


        public class Sample {
            public static void main(String[] args) throws IOException {
                FileWriter fw = new FileWriter("sample.txt");
                fw.write("Write once, run anywhere");

                BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
                String line = br.readLine();
                System.out.println(line);  // null 이 출력된다.
            }
        }
         */
        // FileWriter를 이용하여 파일을 열고 다시 읽기전에
        // fw를 close 해주는 작업이 없어 오류가 난다.
        // fw.write() 코드 다음 줄에 fw.close()를 추가하면 오류가 없어진다.

        // Q3 끝.


        // Q4. 사용자의 입력을 파일에 저장하기
        //     시용자의 입력을 sample.txt에 저장하는 프로그램을 작성하라.
        //     프로그램을 다시 실행하여도 기존 작성 내용을 유지하고 추가 작성하도록 하라.
//        Scanner sc = new Scanner(System.in);
//        String user_input = sc.nextLine();
//        PrintWriter fw = new PrintWriter(new FileWriter("sample.txt", true));
//        fw.println(user_input);
//        fw.close();
        // Q4 끝.

        // Q5. 파일 내용 바꾸어 저장하기
        //     "Life is too short \n You need Python"을 저장하고 있는 sample.txt
        //     파일에서 Pyhon을 JAVA로 변경하라.
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        ArrayList<String> temp = new ArrayList<>();
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            temp.add(line);
        }

        String text = String.join("\n", temp);
        text.replaceAll("Python", "JAVA");
        System.out.println(text);
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter("sample.txt"));
        pw.println(text);

        pw.close();

        // 오래걸렸다. join함수를 사용하면 리스트를 자동으로 쪼개서 String화 해준다..

        // Q5 끝.
    }
}
