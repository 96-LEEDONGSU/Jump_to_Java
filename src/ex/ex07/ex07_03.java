package ex.ex07;

import java.util.ArrayList;

public class ex07_03 implements Runnable{
    String name;

    public ex07_03(String sn){ name = sn; }

    public void run(){
        System.out.printf("%s done.\n", this.name);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Thread> temp = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Thread t = new Thread(new ex07_03(("w "+ String.valueOf(i))));
            t.start();
            temp.add(t);
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}
