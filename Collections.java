package temp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

//        list2.add(74);
//        list2.add(18);
//        list2.add(54);
//        list2.add(8);
//
//        System.out.println(list2);


        List<Integer> vector = new Vector<>();
        vector.add(49);
        vector.add(11);
        vector.add(15);
        vector.add(56);

        System.out.println(vector);
    }
}
