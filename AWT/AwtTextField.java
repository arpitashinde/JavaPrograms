package AWT;

import java.awt.*;

public class AwtTextField {
    public static void main(String[] args) {
        Frame f = new Frame("TextField Example");
        Label l1,l2;
        TextField t1, t2;
        l1= new Label("Enter your name: ");
        t1 = new TextField();
        t1.setBounds(50, 100, 200, 150);
        l2= new Label("Enter your email id: ");

        t2 = new TextField();
        t2.setBounds(50, 150, 200, 150);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
