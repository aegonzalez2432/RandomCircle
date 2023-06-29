import java.awt.*;
import javax.swing.JPanel;

public class Circle extends JPanel{
    int diameter;
    public void paint(Graphics g){
        setSize(500,500);               //set size of circle Panel
        g.drawOval(0,0,diameter, diameter);     //draw the circle at point (0,0) with height and width(diameter) = diameter
        g.setColor(Color.CYAN);
        g.fillOval(0, 0, diameter, diameter);
    }
    public Circle(int diameter){                        //constructor
        this.diameter = diameter;                       //takes diameter parameter and assigns it to this.diameter for
                                                        //drawing the circle
    }
}
