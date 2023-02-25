package temp.Swing;

import javax.swing.*;
import java.awt.event.ActionListener;

public class JComboBoxEx {
    public static void main(String[] args) {
        ComboBox c1= new ComboBox();
    }
}
class ComboBox extends JComboBox{
    ComboBox(){

        JFrame f=new JFrame("ComboBox Example");
        String[] lan={"Java","CPP","C#","Python","Dart"};
        JComboBox<String> cb=new JComboBox<>(lan);
        cb.setBounds(50, 50,90,20);
        cb.addActionListener(e->{
            JComboBox c1= (JComboBox)e.getSource();
            String selected = (String) c1.getSelectedItem();
            System.out.println("Selected Language: "+selected);
        });

        f.add(cb);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
    }

}
