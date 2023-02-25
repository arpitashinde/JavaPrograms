package temp.a;

public class UserException {
    public static void main(String[] args) {
        try{
            age(56);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void age(int age) throws InvalidageExcep {
        if (age<18){
            throw new InvalidageExcep("You are not eligible");
        }
        else {
            System.out.println("You can drive");
        }
    }

}

 class InvalidageExcep extends Exception{
    public InvalidageExcep(String msg){
        System.out.println(msg);
    }
}
