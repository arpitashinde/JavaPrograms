package temp.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton {
    public static void main(String[] args) {
letter news = new letter();
    }
}

class letter extends JFrame {
    String msg;
    JTextField t1;
    JLabel l1;
    JRadioButton r1;
    JRadioButton r2;
    JButton b1;
    JLabel lab1;
    public letter(){

        t1= new JTextField(10);
        l1 = new JLabel(" ");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("female");
        b1 = new JButton("proceed");

        add(t1);
        add(r1);
        add(r2);
        add(b1);
        add(l1);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()){
                    msg= "you are male";

                }
                else{
                    msg = "you are female";
                }
                l1.setText(msg+" ");
            }
        });


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
