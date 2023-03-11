package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtAddition {
    public static void main(String[] args) {
        addition a1 = new addition();
    }
}
class addition extends Frame {
    TextField tf1, tf2, tf3;
    Button b1, b2;

    addition() {
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();

        tf1.setBounds(50, 50, 150, 20);
        tf2.setBounds(50, 100, 150, 20);
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);
        b1 = new Button("+");
        b2 = new Button("-");
        b1.setBounds(50, 200, 50, 50);
        b2.setBounds(120, 200, 50, 50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1 = tf1.getText();
                String s2 = tf2.getText();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = 0;
                if (e.getSource() == b1) {
                    c = a + b;
                } else if (e.getSource() == b2) {
                    c = a - b;
                }
                String result = String.valueOf(c);
                tf3.setText(result);

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1 = tf1.getText();
                String s2 = tf2.getText();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = 0;
                if (e.getSource() == b1) {
                    c = a + b;
                } else if (e.getSource() == b2) {
                    c = a - b;
                }
                String result = String.valueOf(c);
                tf3.setText(result);
            }
        });
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

}