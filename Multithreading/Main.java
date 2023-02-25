package temp.Multithreading;

public class Main {
    public static void main(String[] args) {
Thread t1 = new mythread();
t1.start();

    }
}

class A{

}

class mythread extends Thread{
    int arr[]={1,2,3};
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(arr[i]*2);
        }
    }


}

