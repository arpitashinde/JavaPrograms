package temp.Multithreading;

public class Synchronized {

    public static void main(String[] args) throws Exception{
        Incre i1 = new Incre();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    i1.count1();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    i1.count1();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i1.c);



    }
}

class Incre{
    int c;
    public synchronized void count1(){
        c++;
    }

}
