import java.awt.*;
import java.util.ArrayList;

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

}