package Swings;

import javax.swing.*;
import java.awt.*;

public class JMenuEx {
    public static void main(String[] args) {
        jMenu fs = new jMenu();
    }
}
class jMenu extends JFrame {
    jMenu(){
        JFrame f = new JFrame("JMenuBar");
        f.setLayout(new GridLayout());


        JMenuBar mb = new JMenuBar();
        f.setJMenuBar(mb);
        JMenu m1 = new JMenu("Front-end");
        JMenu m2 = new JMenu("Back-End");
        JMenuItem f1 = new JMenuItem("HTML");
        JMenuItem f2 = new JMenuItem("CSS");
        JMenuItem f3 = new JMenuItem("Javascript");
        JMenuItem b1 = new JMenuItem("");
        JMenuItem b2 = new JMenuItem("HTML");
        JMenuItem b3 = new JMenuItem("HTML");
        mb.add(m1);
        mb.add(m2);
        m1.add(f1);
        m1.add(f2);
        m1.add(f3);
        m2.add(b1);
        m2.add(b2);
        m2.add(b3);
        m2.add("extra");
        System.out.println(mb.getMenuCount());
        System.out.println(m2.getItemCount());
        System.out.println(m2.getItem(1));
        System.out.println(m2.getItem(1).getText());

        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}