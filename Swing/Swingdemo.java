package temp.a;

import javax.swing.*;

public class Swingdemo  {
    public static void main(String[] args) {
        GUI gui = new GUI();

    }
}

class GUI extends JFrame{//follows cardlayout
    public GUI(){
        JLabel l = new JLabel("This is my first GUI") ;
        add(l);
        setVisible(true);
        setSize(400,400);
    }

}
