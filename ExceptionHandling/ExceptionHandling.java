package temp;

public class ExceptionHandling  {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
            div(4,0);
        } catch (Exception e) {
            System.out.println("cannot be divided by zero");
        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }



    static void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("forced msg: cant divide by zero");
        }
        else{
            System.out.println(a/b);
        }

    }


}
class myexcep extends Exception{
    public myexcep(String msg){
        System.out.println(msg);
    }

}
