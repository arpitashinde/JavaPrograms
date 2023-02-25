package temp.Multithreading;

public class ByRunnable {
    public static void main(String[] args) throws Exception {
        random1 r = new random1();
        another1 a = new another1();

        Thread r1 = new Thread(r);
        Thread a1 = new Thread(a);
        r1.setPriority(1);
        a1.setPriority(10);

        r1.start();
        a1.start();

    }
}

class random1 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("This is random method");
            try{Thread.sleep(500);} catch (Exception e){}
        }
    }
}

class another1 extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is another method");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }

        }
    }
}
