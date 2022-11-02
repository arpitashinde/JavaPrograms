package Methods;

public class Swap {
    public static void main(String[] args) {

        swap(12,35);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
