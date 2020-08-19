import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Stage stage;

        public App() {
            setPreferredSize(new Dimension(720, 720));
            stage = new Stage();
        }

        @Override
        public void paint(Graphics g) {
<<<<<<< HEAD
            stage.paint(g);
=======
            stage.paint(g, getMousePosition());
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }
}