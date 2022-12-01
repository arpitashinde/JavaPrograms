package OOPs;

public class Constructor {
    public static void main(String[] args) {
        shape s1 = new shape(44,5,6);
        System.out.println(s1.l);
        //constructor overloading
        shape s2= new shape(44,66);
        //copy constructor
        shape s3 = new shape(s2);
        System.out.println(s3.l);
    }
    
}

class shape {
    int l, h, w;




    public shape(int l, int h, int w) {
        this.l=l;
        this.h=h;
        this.w=w;
    }
    //constructor overriding
    //java seperates the constructor based on no of arguments
    public shape(int l, int h) {
        this.l=l;
        this.h=h;
    }

    //copy constructor syntax
    shape (shape s){
        l=s.l;
        h=s.h;
        System.out.println("Copy constructor");
    }


}
