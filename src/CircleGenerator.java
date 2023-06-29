

import java.awt.*;
import java.util.Random;
import javax.swing.*;


public class CircleGenerator  extends JPanel{
    Random rand = new Random();
    int diameter = rand.nextInt(300);       //generates random number up to 300 for the diameter of the circle
    int radius =  Math.floorDiv(diameter, 2);       //derives radius from diameter
    JTextArea dimensions = new JTextArea();         //text area for dimensions to be listed
    double area = Math.PI*radius*radius;            //area of circle to be generated
    double circumference = Math.PI*radius*2;        //circumference of the circle
    Container cont;
    public CircleGenerator(){
        JFrame circFrame = new JFrame("Circle Generator");      //create JFrame and title it "Circle Generator
        circFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        circFrame.setSize(600,400);
        circFrame.setLayout(new FlowLayout());                  //set layout to FlowLayout
        cont = circFrame.getContentPane();
        dimensions.setText("Radius: " + radius + "\nDiameter: " + diameter + "\nCircumference: " + circumference + "\nArea: " + area);
        Circle circle = new Circle(diameter);               //create circle creating new object from Circle class
        dimensions.setLocation(0,0);                 //Set location of textArea at point (0,0)
        dimensions.setEditable(false);                      //make textArea uneditable by user

        cont.add(circle);                                   //add circle to container
        cont.add(dimensions, 0);                    //add dimensions to container
        circFrame.setVisible(true);                     //set GUI visible
    }


}
