package AWT;

import java.awt.*;

public class AwtCheckbox {
    public static void main(String[] args) {
        Frame f = new Frame("Checkbox Example");
        Checkbox c1 = new Checkbox("C++");
        Checkbox c2 = new Checkbox("Java", true);//true- by default selected
        c1.setBounds(100, 100,  50, 50);
        c2.setBounds(100, 150,  50, 50);
        f.add(c1);
        f.add(c2);

// setting size, layout and visibility of frame
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
