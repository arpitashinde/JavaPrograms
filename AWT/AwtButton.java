package AWT;
import java.awt.*;
public class AwtButton {
    public static void main (String[] args) {

        Frame f = new Frame("Button Example");

        Button b = new Button("Click Here");
        Button b1 = new Button();
        b1.setLabel("external lable");
        b.setBounds(50,100,80,30);

        f.add(b);
        f.add(b1);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

    }
}