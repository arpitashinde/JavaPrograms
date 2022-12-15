package temp.a;

@FunctionalInterface
interface La{
    void add();
}

public class Lambda {
    public static void main(String[] args) {
        //this is anonymous inner class
//        La l1 = new La(){
//            public void add(){
//                System.out.println("this is anonymouos inner class");
//            }
//        };
//        l1.add();

        //this is lambda function

        La l1 = ()-> System.out.println("this is lambda function");
        l1.add();
    }
}
