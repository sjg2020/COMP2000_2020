import java.awt.*;

<<<<<<< HEAD


public class Cell extends java.awt.Rectangle{
    // fields
    public int x;
    public int y;
=======
class Cell extends Rectangle {
    // fields
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
    static int size = 35;
    

    //constructors

    public Cell(int x, int y){
<<<<<<< HEAD
        super(x, y);
        this.x  = x;
        this.y = y;
=======
        super(x,y,size,size);
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
    }

    //methods
    void paint(Graphics g){
        if(contains(mousePos)){
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);

    }

<<<<<<< HEAD

    public boolean contains(Point p) {
        if (p != null) {
=======
    public boolean contains(Point p){
        if (p != null){
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
            return super.contains(p);
        } else {
            return false;
        }
    }
}



