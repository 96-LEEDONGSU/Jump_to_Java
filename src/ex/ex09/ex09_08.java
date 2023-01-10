package ex.ex09;

import java.io.*;
import java.util.ArrayList;

public class ex09_08 {
    public static void main(String[] args) throws IOException {
        // Q8. 파일을 읽어 평균 값 저장하기
        //     총 10줄로 이루어진 sample.txt 파일이 있다. 파일의 숫자를 모두 읽어
        //     총합과 평균을 구하여 평균을 result.txt 파일에 작성하라.
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        ArrayList<Integer> temp = new ArrayList<>();
        while(true) {
            String line = br.readLine();
            if(line == null) break;
            temp.add(Integer.parseInt(line));
        }
        int file_result = 0;
        float file_aver;

        for(int i = 0; i< temp.size();i++){
            file_result = file_result + temp.get(i);
        }

        file_aver = file_result / temp.size();
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter("result.txt"));
        pw.println(file_aver);
        pw.close();

        // Q8 끝.
    }
}
