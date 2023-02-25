package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiFrames {
    public static void main(String[] args) {
        frames f1 = new frames();
    }
}
class frames extends JFrame{
    frames(){
        JFrame f = new JFrame("Multiple Frames");
        f.setLayout(new FlowLayout());
        JButton b1 = new JButton("Another Frame");
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new toolbar();
                dispose();
            }
        });
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
