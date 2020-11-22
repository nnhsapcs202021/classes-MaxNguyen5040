import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class CityCar{

    private int xLeft;
    private int yTop;
    private Color carcolor;
    private Color wheelcolor;
    private int carwidth;
    private int carheight;
    private int wheelwidth;

    public CityCar(int initialX, int initialY,int initialcarwidth, int initialcarheight,Color initialcarcolor,Color initialwheelcolor, int initialwheelwidth)
    {
        this.xLeft = initialX;
        this.yTop = initialY;
        this.carcolor = initialcarcolor;
        this.wheelcolor = initialwheelcolor;
        this.carwidth = initialcarwidth;
        this.carheight = initialcarheight;
        this.wheelwidth = initialwheelwidth;


    }

    public void draw(Graphics2D g2) {

        //main car
        g2.setColor(Color.black);
        Rectangle2D.Double main = new Rectangle2D.Double(this.xLeft, this.yTop, carwidth, carheight);
        g2.draw(main);
        g2.setColor(carcolor);
        g2.fillRect(this.xLeft, this.yTop, carwidth, carheight);



        //wheel
        g2.setColor(Color.black);
        Ellipse2D.Double wheel1 = new Ellipse2D.Double(this.xLeft,this.yTop + carheight,wheelwidth,wheelwidth);
        Ellipse2D.Double wheel2 = new Ellipse2D.Double(this.xLeft+carwidth-22,this.yTop+carheight,wheelwidth,wheelwidth);
        g2.draw(wheel1);
        g2.draw(wheel2);
        g2.setColor(wheelcolor);
        g2.fillOval(this.xLeft,this.yTop + carheight,wheelwidth,wheelwidth);
        g2.fillOval(this.xLeft+carwidth-22,this.yTop+carheight,wheelwidth,wheelwidth);


        }

        public void drive() {
            Random generator = new Random();
            int randommore = generator.nextInt(21);
            this.xLeft += (randommore + 10);
            if(this.xLeft > 840){
                this.xLeft = -80;
            }
        }

        public void driveback() {
        Random generator = new Random();
        int randommore = generator.nextInt(21);
        this.xLeft -= (randommore + 10);
        if(this.xLeft < -80){
            this.xLeft = 840;
        }
    }




}





