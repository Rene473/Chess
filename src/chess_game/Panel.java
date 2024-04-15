package chess_game;

import javax.swing.*;

public class Panel extends JFrame {

    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 800;

    public Panel() {
        this.add(new Board());
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
