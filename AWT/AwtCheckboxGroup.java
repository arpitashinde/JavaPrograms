package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AwtCheckboxGroup {
    public static void main(String[] args) {
        Frame f= new Frame("CheckboxGroup Example");
        Checkbox cb1, cb2 , cb3;
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        CheckboxGroup cbg = new CheckboxGroup();

         cb1 = new Checkbox("C++", cbg, false);
         cb2 = new Checkbox("Java", cbg, false);
         cb3 = new Checkbox("Python", cbg, false);


        f.add(cb1); f.add(cb2); f.add(cb3); f.add(label);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ is selected");
            }
        });
        cb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java is selected");
            }
        });
    }
}

