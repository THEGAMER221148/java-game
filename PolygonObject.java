import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;
public class PolygonObject {
    Polygon p;
    Color col;

    public PolygonObject(int[] x, int[] y, Color c){
        p = new Polygon();
        p.xpoints = x;
        p.ypoints = y;
        p.npoints = x.length;
        col = c;
    }

    void drawPolygon(Graphics g){
        g.setColor(col);
        g.drawPolygon(p);
    }
}