import java.awt.Color;
import java.awt.Polygon;

public class DPolygon {
    int[] x;
    int[] y;
    int[] z;
    Color col;

    public DPolygon(int[] x, int[] y, int[] z, Color c){
        this.x = x;
        this.y = y;
        this.z = z;
        col = c;
    }
}