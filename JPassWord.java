package temp.Swing;

import javax.swing.*;

public class JPassWord {
    public static void main(String[] args) {
PassWord p1 = new PassWord();
    }
}

class PassWord extends JFrame {
    PassWord() {
        JFrame f = new JFrame("PasswordField");
        JPasswordField pw = new JPasswordField();
        JLabel l1 = new JLabel("Enter Password:");
        l1.setBounds(20, 100, 80, 30);
        pw.setBounds(100, 100, 100, 30);
        f.add(pw);
        f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}


