import java.awt.*;

<<<<<<< HEAD
public interface Actor {

 public void paint(Graphics g);
=======
public abstract class Actor {
    Color colour;
    Cell loc;

    public void paint(Graphics g){
        g.setColor(colour);
        g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
        g.setColor(Color.GRAY);
        g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    }
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
}