package Graphics;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        graphics g1 = new graphics();
    }
}
class graphics extends JFrame {
    graphics(){
        Panel p = new Panel();
        add(p);
        p.setBackground(Color.black);
        setSize(700,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}