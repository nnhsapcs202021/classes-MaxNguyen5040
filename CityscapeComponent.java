import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Max Nguyen
 * @version Nov 6 2020
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    //private Car car1;
    //private Sun sun1;
    private Boat boat1;
    private Boat boat2;
    private Boat boat3;
    private Building building1;
    private Building building2;
    private Building building3;
    private Building building4;
    private Building building5;
    private Building building6;
    private Building building7;
    private Building building8;
    private Building building9;
    private Building building10;
    private Building building11;
    private Building building12;

    private CityCar car1;
    private CityCar car2;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(){

        boat1 = new Boat(-50,400, Color.darkGray,Color.WHITE,Color.black);
        boat2 = new Boat(450,460, Color.orange,Color.red,Color.black);
        boat3 = new Boat(750,530, Color.green,Color.lightGray,Color.black);

        building1 = new Building(5,20,50,170, Color.black,Color.GRAY, true);
        building2 = new Building(60,50,50,140, Color.black,Color.GRAY, true);
        building3 = new Building(115,100,100,90, Color.black,Color.GRAY, true);
        building4 = new Building(220,20,50,170, Color.black,Color.GRAY, true);
        building5 = new Building(275,50,50,140, Color.black,Color.GRAY, true);
        building6 = new Building(330,20,50,170, Color.black,Color.GRAY, true);
        building7 = new Building(385,50,50,140, Color.black,Color.GRAY, true);
        building8 = new Building(440,100,100,90, Color.black,Color.GRAY, true);
        building9 = new Building(545,20,50,170, Color.black,Color.GRAY, true);
        building10 = new Building(600,50,50,140, Color.black,Color.GRAY, true);
        building11 = new Building(655,20,50,170, Color.black,Color.GRAY, true);
        building12 = new Building(710,100,100,90, Color.black,Color.GRAY, true);

        car1 = new CityCar(100,240,70,25,Color.GRAY,Color.black,20);
        car2 = new CityCar(600,190,70,25,Color.red,Color.black,20);

    }

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *g
     */

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method on each object in your Cityscape
        // ...

        //sky
        g2.setColor(Color.cyan);
        g2.fillRect(0,0,800,190);

        //road
        g2.setColor(Color.darkGray);
        g2.fillRect(0,190,800,100);

        //yellow lines
        for(int i = 10; i< 800; i+= 20){
            g2.setColor(Color.yellow);
            g2.fillRect(i,240,20,5);
            i+=20;
        }

        //beach
        g2.setColor(Color.orange);
        g2.fillRect(0,290,800,70);

        //ocean
        g2.setColor(Color.blue);
        g2.fillRect(0,360,800,220);

        boat1.draw(g2);
        boat2.draw(g2);
        boat3.draw(g2);

        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        building7.draw(g2);
        building8.draw(g2);
        building9.draw(g2);
        building10.draw(g2);
        building11.draw(g2);
        building12.draw(g2);

        car1.draw(g2);
        car2.draw(g2);



        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        //this.car1.drive() <<< example method

        this.boat1.move();
        this.boat2.move();
        this.boat3.move();

        this.car1.drive();
        this.car2.driveback();

        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
