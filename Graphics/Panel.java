package Graphics;
import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
        //to set color of text
        g.setColor(Color.white);
        //to edit font
        g.setFont(new Font(Font.SERIF,Font.BOLD,45));
        //to add string on panel
        g.drawString("graphics in java",50,50);
        //to draw line
        g.drawLine(400,150,300,200);
        //to draw rectangle
        //g.fillRect(170,400,100,60);
        g.drawRect(400,150,100,60);
        //to draw round rectangle
       // g.fillRoundRect(200,120,80,40,20,20);
        g.drawRoundRect(200,120,80,40,20,20);
        //for circle/oval
        g.drawOval(50, 100, 50, 20);
       // g.fillOval(120, 100, 50, 30);
        g.drawOval(50, 150, 50, 50);
        //g.fillOval(120, 150, 50, 50);
        g.drawArc(300,400,100,100,0,120);
        g.fillArc(300,400,100,100,0,120);
//for polygon
        int x[]={100,200,300};
        int y[]={400,500,400};
        //g.drawPolygon(x,y,3);
        g.drawPolyline(x,y,3);
        String url ="C:\\Users\\Admin\\Downloads\\Become.png";
        Image image = new ImageIcon(url).getImage();
        g.drawImage(image,300,60,200,100,null);
        //to clear all the graphics
       // g.clearRect(0,0,700,800);
    }
}