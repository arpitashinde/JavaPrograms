package temp.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkbox {
    public static void main(String[] args) {
        Form f1 = new Form();
    }
}

class Form extends JFrame{

    String msg;
    JTextField j1;
    JCheckBox c1,c2,c3;
    JButton b1;
    JLabel l1;
    public Form(){

        j1= new JTextField(10);
        c1=new JCheckBox("OOPs");
        c2= new JCheckBox("Java");
        c3 =new JCheckBox("DSA");
        b1= new JButton("Confirm");
        l1 = new JLabel("");

        add(j1);
        add(c1);
        add(c2);
        add(c3);
        add(b1);
        add(l1);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c1.isSelected()){
                    msg="OOPs is selected";
                }
                if (c2.isSelected()){
                    msg="Java is selected";
                }
                else{
                    msg= "Dsa is selected";
                }
                l1.setText(msg+"");
            }
        });
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
