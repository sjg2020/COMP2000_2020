import java.awt.*;

<<<<<<< HEAD
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
      
=======
public class Rabbit extends Actor {

    public Rabbit(Cell loc) {
        this.loc = loc;
        this.colour = Color.WHITE;
    }

>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
}