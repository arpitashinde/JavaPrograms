package AWT;

import java.awt.*;

public class AwtTextArea {
    public static void main(String[] args) {
        Frame f = new Frame();
        TextArea area = new TextArea("used to print multiple lines");
        area.setBounds(10, 30, 300, 300);
        f.add(area);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
