package temp.Swing;

import javax.swing.*;

public class Jlist {
       public static void main(String[] args) {

           list j1 = new list();
    }
}

class list extends JFrame{
    list(){
        JFrame f = new JFrame();
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Java");
        l1.addElement("Python");
        l1.addElement("C");
        l1.addElement("CPP");
        JList<String> list = new JList<>(l1);
        list.setBounds(100, 100, 75, 75);
        f.add(list);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
