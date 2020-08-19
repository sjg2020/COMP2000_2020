import java.awt.*;
import java.util.ArrayList;

public class Puppy implements Actor {
    Grid sam;
    Cell x;
     int j;
     int f;

    public Puppy(Grid sam, int j, int f) {
        x = sam.cells[0][0];
        j = x.x;
        f = x.y;
    }

    @Override
    public void  paint(Graphics g) {
        g.fillRect(j, f, 35, 35);
                g.setColor(Color.GREEN);
                g.drawRect(45,45,35,35);
        }
        
    


    }
    
