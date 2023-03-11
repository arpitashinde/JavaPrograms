package AWT;
import  java.awt.*;
public class AwtMenu {
    public static void main(String[] args) {
        Frame f= new Frame("Menu and MenuItem Example");
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("Engineering");
        Menu btech=new Menu("BTECH");
        Menu mtech=new Menu("MTECH");

        MenuItem i1=new MenuItem("COMPUTER");
        MenuItem i2=new MenuItem("IT");
        MenuItem i3=new MenuItem("CIVIL");
        MenuItem i4=new MenuItem("MECH");
        MenuItem i5=new MenuItem("ELECTRICAL");

        btech.add(i1);
        btech.add(i2);
        btech.add(i3);
        btech.add(i4);
        btech.add(i5);

        mtech.add(i1);
        mtech.add(i2);
        mtech.add(i3);
        mtech.add(i4);
        mtech.add(i5);
        menu.add(btech);
        menu.add(mtech);
        mb.add(menu);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


}
}
