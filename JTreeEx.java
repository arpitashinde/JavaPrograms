package Swings;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTreeEx {
    public static void main(String[] args) {
        jTree d1= new jTree();
    }
}

class jTree extends  JFrame{
    jTree(){
        JFrame f= new JFrame("Jtree");
        DefaultMutableTreeNode degree =new DefaultMutableTreeNode("Degree");
        DefaultMutableTreeNode pg =new DefaultMutableTreeNode("Masters");
        DefaultMutableTreeNode ME =new DefaultMutableTreeNode("ME");
        DefaultMutableTreeNode Mtech =new DefaultMutableTreeNode("MTech");
        DefaultMutableTreeNode ug =new DefaultMutableTreeNode("Bachelors");
        DefaultMutableTreeNode BE =new DefaultMutableTreeNode("BE");
        DefaultMutableTreeNode BTech =new DefaultMutableTreeNode("BTech");
        JTree root = new JTree(degree);
        f.add(root);

        pg.add(ME);
        pg.add(Mtech);
        ug.add(BE);
        ug.add(BTech);
        degree.add(pg);
        degree.add(ug);
        f.setSize(200,200);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
