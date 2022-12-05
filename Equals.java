package temp;

public class Equals {
    public static void main(String[] args) {
        box b1= new box(34);
        box b2 = new box(34);
        System.out.println(b1.equals(b2));
        if(b1.equals(b2)){
            System.out.println("its equal");
        }
        else{
            System.out.println("its unequal");
        }

    }
}

class box{
    int num;
    box (int num){

    }
    public boolean equals(Object obj){
        return this.num ==((box)obj).num;
    }

}
