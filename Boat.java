import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

//A boat that can be placed on the screen

public class Boat {
    private int xLeft;
    private int yTop;

    public Boat(int initialX, int initialY)
    {
        this.xLeft = initialX;
        this.yTop = initialY;
    }

    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double hull = new Rectangle2D.Double(this.xLeft, this.yTop, 120, 20);
        Rectangle2D.Double deck = new Rectangle2D.Double(this.xLeft, this.yTop-20, 80, 20);
        Point2D.Double bow1 = new Point2D.Double(this.xLeft + 120, this.yTop+20);
        Point2D.Double bow2 = new Point2D.Double(this.xLeft + 140, this.yTop);
        Point2D.Double bow3 = new Point2D.Double(this.xLeft + 120, this.yTop);
        Point2D.Double bow4 = new Point2D.Double(this.xLeft + 100, this.yTop);
        Point2D.Double deck1 = new Point2D.Double(this.xLeft + 80, this.yTop-20);
        Point2D.Double ws1 = new Point2D.Double(this.xLeft + 70, this.yTop-20);
        Point2D.Double ws2 = new Point2D.Double(this.xLeft + 60, this.yTop-40);

        Line2D.Double bow = new Line2D.Double(bow1, bow2);
        Line2D.Double hullbow = new Line2D.Double(bow3, bow2);
        Line2D.Double deckhull = new Line2D.Double(deck1, bow4);
        Line2D.Double ws = new Line2D.Double(ws1, ws2);

        //Drawing the boat
        g2.draw(hull);
        g2.draw(deck);
        g2.draw(bow);
        g2.draw(hullbow);
        g2.draw(deckhull);
        g2.draw(ws);

    }
}
