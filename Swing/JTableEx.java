package temp.Swing;
   import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

    public class JTableEx {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            JTable table = new JTable(new Object[][]{{"Kiran", "Developer"}, {"Janvi", "HR"}}, new Object[]{"Name", "Post"});
            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane);
            frame.pack();
            frame.setVisible(true);
        }
    }
