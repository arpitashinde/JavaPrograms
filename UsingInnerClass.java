package temp.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsingInnerClass {
    public static void main(String[] args) {
        ADD AG = new ADD();
    }
}

class ADD extends JFrame  {
    JTextField t1;
    JTextField t2;
    JButton b1;
    JLabel l2;
    public ADD(){
        setLayout(new FlowLayout());
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("add");
        JLabel l1= new JLabel("Answer");
        l2 = new JLabel("");

        add(t1);
        add(t2);
        add(b1);
        add(l1);
        add(l2);

        ActionListener AL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1+num2;
                l2.setText(sum+"");
            }
        };
        b1.addActionListener(AL);
        setVisible(true);
        setSize(400,400);
    }

}