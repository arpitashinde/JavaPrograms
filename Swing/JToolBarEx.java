package Swings;

import javax.swing.*;
import java.awt.*;

public class JToolBarEx {
    public static void main(String[] args) {
        toolbar t1= new toolbar();
    }
}

class toolbar extends JFrame{
    toolbar(){
        JFrame f = new JFrame("JTool Bar example");
        f.setLayout(new FlowLayout());
        //JToolBar tb = new JToolBar(JToolBar.VERTICAL);
        JToolBar tb = new JToolBar();
        tb.addSeparator(new Dimension(5,5));
        tb.add(new JButton("a"));
        tb.addSeparator(new Dimension(5,5));
        tb.add(new JButton("b"));
        tb.addSeparator(new Dimension(5,5));
        tb.add(new JButton("c"));

        System.out.println(tb.getComponentAtIndex(1));
        tb.isFloatable();
        f.add(tb);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
