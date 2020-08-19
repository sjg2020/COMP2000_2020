import java.awt.*;

<<<<<<< HEAD
class Stage{
Grid sam = new Grid();
Puppy i = new Puppy(sam, 0, 0);
Rabbit j = new Rabbit(sam, 0, 0);
Lion a = new Lion(sam, 0, 0);





public void paint(Graphics g){
sam.paint(g);
i.paint(g);
j.paint(g);
a.paint(g);
        }

=======
public class Stage {
    Grid grid;
    Actor puppy;
    Actor lion;
    Actor rabbit;

    public Stage(){
        grid = new Grid();
        puppy = new Puppy(grid.cellAtColRow(0, 0));
        lion = new Lion(grid.cellAtColRow(0, 18));
        rabbit = new Rabbit(grid.cellAtColRow(14,3));
    }

    public void paint(Graphics g, Point mouseLoc){
        grid.paint(g,mouseLoc);
        puppy.paint(g);
        lion.paint(g);
        rabbit.paint(g);
    }
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
}