import java.awt.*;

public class Rabbit implements Actor{
    
    Grid sam;
    Cell x;
    int j;
    int f;
    

public Rabbit(Grid sam, int j, int f){
    x = sam.cells[0][0];
    j = x.x;
    f = x.y;
    }

  
    public void paint(Graphics g) {
                g.fillRect(j,f,35, 35);
                g.setColor(Color.white);
                g.drawRect(j,f,35,35);
        }
      
}