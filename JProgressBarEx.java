package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class JProgressBarEx {
    public static void main(String[] args) {
        progressbar pb = new progressbar();

    }
}
class progressbar extends JFrame implements ActionListener{
    JProgressBar jb;
    int i;
    Timer t ;
    JButton a;
    progressbar(){
        setLayout(new FlowLayout());
         a = new JButton("click");
        jb = new JProgressBar(0,20);
        i=0;
         t = new Timer(250,this);

        a.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                t.start();
            }
        });
        jb.setStringPainted(true);
        add(jb);

        add(a);
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if( i==20){
            new toolbar();
            dispose();
        }
        i++;
        jb.setValue(i);
    }
}