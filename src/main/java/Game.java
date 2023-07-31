import javax.swing.*;

public class Game {

    JFrame frame;

    public Game() {
        frame = new JFrame("The Snake Game");
        frame.add(new Graphics());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}