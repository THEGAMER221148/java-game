import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
public class Screen extends JPanel {
    PolygonObject obj1;

    public Screen(){
        obj1 = new PolygonObject(new int[]{0, 100, 100}, new int[]{0, 0, 100}, new Color(255, 0, 0));
    }

    public void paintComponent(Graphics g){
        obj1.drawPolygon(g);
    }
}
