package temp.Multithreading;

public class MultithreadingMethods {
    public static void main(String[] args) throws Exception {
        random11 r = new random11();
        another11 a = new another11();

        Thread r1 = new Thread(r);
        Thread a1 = new Thread(a);
        r1.setPriority(10);
        a1.setPriority(5);

        r1.start();
        System.out.println(r1.isAlive());
        a1.start();

    }
}

class random11 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("This is random method");
            try{Thread.sleep(500);} catch (Exception e){}
        }
    }
}

class another11 extends Thread{
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

