public class JavaBeans {
    public static void main(String[] args) {

        student s = new student();
        s.setId(35);
        s.setName("Kiran");
        Result r1 = new Result();
        r1.res(s);
      
    }
}
class Result{

    public void res(student s){
        System.out.println(s.getId());
        System.out.println(s.getName());

    }
}
//this is java beans class
class student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}