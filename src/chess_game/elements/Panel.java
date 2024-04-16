package chess_game.elements;

import javax.swing.*;

public class Panel extends JFrame {

    public static final int FRAME_SIZE = 800;

    public Panel() {
        this.add(new Board());
        this.setSize(FRAME_SIZE, FRAME_SIZE);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
