package ex.ex09;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class ex09_07 {
    public static void main(String[] args) throws IOException {
        // Q7. 입력 숫자의 총합 구하기
        //     abc.txt를 불러와서 역순으로 정렬하여 저장하라.

        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        ArrayList<String> temp = new ArrayList<>();
        while(true){
            String line = br.readLine();
            if(line == null) break;
            temp.add(line);
        }

        temp.sort(Comparator.reverseOrder());
        System.out.println(temp);
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter("abc.txt"));
        for(int i = 0; i<temp.size();i++){
            pw.println(temp.get(i));
        }
        pw.close();

        // Q7 끝.
    }
}
