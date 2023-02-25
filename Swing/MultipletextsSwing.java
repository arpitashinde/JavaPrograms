package temp.a;

import javax.swing.*;
import java.awt.*;

public class MultipletextsSwing {
    public static void main(String[] args) {
        Gui gui = new Gui();

    }
}

class Gui extends JFrame {//follows cardlayout
    public Gui(){
        setLayout(new FlowLayout());
        JLabel l = new JLabel("This is my first GUI") ;
        JLabel l1 = new JLabel("This is my second GUI") ;

        add(l);
        add(l1);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
