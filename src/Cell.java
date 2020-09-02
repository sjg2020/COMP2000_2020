import java.awt.*;



public class Cell extends java.awt.Rectangle{
    // fields
    public int x;
    public int y;
    private Point mousePos;
    static int size = 35;
    

    //constructors

    public Cell(int x, int y){
        super(x, y);
        this.x  = x;
        this.y = y;
    }

    //methods
    void paint(Graphics g) {
    ;
        if (contains(mousePos)) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);

    }


    public boolean contains(Point p) {
        if (p != null) {
            return super.contains(p);
        } else {
            return false;
        }
    }
}



