package temp.Multithreading;

public class Join {
    public static void main(String[] args) throws Exception{
        Increment i1 = new Increment();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    i1.count();
                }
            }
        });
        t1.start();
        //t1.join();
        System.out.println(i1.c);
        


    }
}

class Increment{
    int c;
    public void count(){
        c++;
    }

}

