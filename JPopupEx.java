package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopupEx {
    public static void main(String[] args) {
        jpopup j1= new jpopup();
    }
}

class jpopup extends JFrame{
    jpopup(){
        final JFrame f= new JFrame("JPopUp Example");
        f.setLayout(new GridLayout(5,1));
        final JPopupMenu pm = new JPopupMenu("Pop");
        f.add(pm);
        JMenuItem m1 = new JMenuItem("Refresh");
        pm.add(m1);

        pm.insert(new JMenuItem("Copy"),1);

        JSeparator sep = new JSeparator();
        pm.add(sep);
        //seperator without its object
        pm.addSeparator();
        pm.insert(new JMenuItem("Paste"),2);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pm.show(f,e.getX(),e.getY());
            }
        });
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
