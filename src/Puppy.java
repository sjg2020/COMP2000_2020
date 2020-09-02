import java.awt.*;
import java.util.ArrayList;
import java.awt.Polygon;


public class Puppy implements Actor {
    Grid sam;
    Cell x;
     int j;
     int f;
     Polygon Sam;

    public Puppy(Grid sam, int j, int f) {
        x = sam.cells[0][0];
        j = x.x;
        f = x.y;
    Polygon Sam = new Polygon();
    Sam.addPoint(x.x, x.y);

    }

    
    public void  paint(Graphics g) {
      Jkss.add(Sam);
      for(int i = 0; i<Jkss.size(); i++){
    g.drawPolygon(Sam);
    g.drawPolygon(xPoints, yPoints, nPoints);
      }
        }
        
    


    }
    
