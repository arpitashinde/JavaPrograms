package AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtLists {
    public static void main(String[] args) {
        Frame f = new Frame();
        List l1 = new List(5);

        l1.setBounds(100, 100, 75, 75);

        l1.add("Computer");
        l1.add("IT");
        l1.add("AI&DS");
        l1.add("Civil");
        l1.add("Mechanical");

        f.add(l1);

        l1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource());
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

