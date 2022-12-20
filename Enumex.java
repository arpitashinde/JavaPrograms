package temp;

public class Enumex {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is Week

        void display() {

        }

        Week() {
            System.out.println("Constructor called for " + this);
        }


        public static void main(String[] args) {
            Week week;
            week = Week.Monday;
            System.out.println(Week.valueOf("Monday"));
//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
        }
    }
}
