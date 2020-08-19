import java.awt.*;
<<<<<<< HEAD
public class Lion implements Actor {
    
        Grid sam;
        Cell x;
        int j;
        int f;
        
    
    public Lion(Grid sam, int j, int f){
        this.x = sam.cells[1][2];
        this.j = x.x;
        this.f = x.y;
        }
    
      
        public void paint(Graphics g) {
                    g.fillRect(j,f,35, 35);
                    g.setColor(Color.red);
                    g.drawRect(j,f,35,35);
            }
            
        
     }    
=======

public class Lion extends Actor {

    public Lion(Cell loc) {
        this.loc = loc;
        this.colour = Color.RED;
    }

}
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
