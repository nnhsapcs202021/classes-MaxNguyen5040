import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Building {

    private int xLeft;
    private int yTop;
    private Color buildingcolor;
    private Color topcolor;
    private int width;
    private int height;
    private boolean topornot;

    public Building(int initialX, int initialY,int initialwidth, int initialheight,Color initialbuildingcolor,Color initialtopcolor, boolean initialtopornot)
    {
        this.xLeft = initialX;
        this.yTop = initialY;
        this.buildingcolor = initialbuildingcolor;
        this.topcolor = initialtopcolor;
        this.width = initialwidth;
        this.height = initialheight;
        this.topornot = initialtopornot;

    }

    public void draw(Graphics2D g2) {

        //main building
        g2.setColor(Color.black);
        Rectangle2D.Double main = new Rectangle2D.Double(this.xLeft, this.yTop, width, height);
        g2.setColor(buildingcolor);
        g2.fillRect(this.xLeft, this.yTop, width, height);
        g2.draw(main);


        //top
        if(topornot == true){
            g2.setColor(Color.black);
            Rectangle2D.Double top = new Rectangle2D.Double(this.xLeft, this.yTop, width, 10);
            g2.setColor(topcolor);
            g2.fillRect(this.xLeft, this.yTop, width, 10);
            g2.draw(top);
        }



    }

}



