import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;

//A boat that can be placed on the screen

public class Boat {
    private int xLeft;
    private int yTop;
    private Color hullcolor;
    private Color deckcolor;
    private Color wscolor;

    public Boat(int initialX, int initialY, Color initialHullColor,Color intialDeckColor,Color intialWsColor)
    {
        this.xLeft = initialX;
        this.yTop = initialY;
        this.hullcolor = initialHullColor;
        this.deckcolor = intialDeckColor;
        this.wscolor = intialWsColor;
    }

    public void draw(Graphics2D g2)
    {
        //hull

        Rectangle2D.Double hull = new Rectangle2D.Double(this.xLeft, this.yTop, 120, 20);
        g2.setColor(hullcolor);
        g2.fillRect(this.xLeft,this.yTop,120,20);

        //bow
        Point2D.Double bow1 = new Point2D.Double(this.xLeft + 120, this.yTop+20);
        Point2D.Double bow2 = new Point2D.Double(this.xLeft + 140, this.yTop);
        Point2D.Double bow3 = new Point2D.Double(this.xLeft + 120, this.yTop);
        Point2D.Double bow4 = new Point2D.Double(this.xLeft + 100, this.yTop);
        Line2D.Double bow = new Line2D.Double(bow1, bow2);
        Line2D.Double hullbow = new Line2D.Double(bow3, bow2);
        int[] bowpointsx = {this.xLeft+120,this.xLeft+140,this.xLeft+120};
        int[] bowpointsy = {this.yTop+20,this.yTop,this.yTop};
        g2.drawPolygon(bowpointsx,bowpointsy,3);
        g2.fillPolygon(bowpointsx,bowpointsy,3);


        //deck
        g2.setColor(deckcolor);
        g2.fillRect(this.xLeft, this.yTop-20, 80, 20);
        Rectangle2D.Double deck = new Rectangle2D.Double(this.xLeft, this.yTop-20, 80, 20);
        Point2D.Double deck1 = new Point2D.Double(this.xLeft + 80, this.yTop-20);
        Line2D.Double deckhull = new Line2D.Double(deck1, bow4);
        int[] deckpointsx = {this.xLeft + 80,this.xLeft + 100,this.xLeft + 80};
        int[] deckpointsy = {this.yTop-19,this.yTop,this.yTop};
        g2.drawPolygon(deckpointsx,deckpointsy,3);
        g2.fillPolygon(deckpointsx,deckpointsy,3);

        //windshield
        g2.setColor(wscolor);
        g2.drawLine(this.xLeft + 70, this.yTop-20,this.xLeft + 60, this.yTop-35);

        //Drawing the boat
        g2.setColor(Color.black);
        g2.draw(hull);
        g2.draw(deck);
        g2.draw(bow);
        g2.draw(hullbow);
        g2.draw(deckhull);




    }

    public void move(){
        Random generator = new Random();
        int randommore = generator.nextInt(21);
        this.xLeft += (randommore + 10);
        if(this.xLeft > 840){
            this.xLeft = -80;
        }
    }
}
