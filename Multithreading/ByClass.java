package temp.Multithreading;

public class ByClass {
    public static void main(String[] args) {
 Thread r = new random();
 Thread a = new another();
 a.start();
 try{Thread.sleep(50);} catch (Exception e){}
 r.start();

    }
}

class random extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("This is random method");
        try{Thread.sleep(500);} catch (Exception e){}
        }
    }
}

class another extends Thread{
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

