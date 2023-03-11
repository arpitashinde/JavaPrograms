package AWT;

import java.awt.*;

public class AwtLable {
    public static void main(String[] args) {
        Frame f = new Frame ("Label example");
        Label l1, l2;

        //by default alignment is 0-left
        l1 = new Label ("First Label.",2);
        l2 = new Label ("Second Label.");

        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 150, 100, 30);
        f.add(l1);
        f.add(l2);
        System.out.println(l1.getText());
        System.out.println(l1.getAlignment());

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
