package chess_game;

public class Chess {
    private final Panel panel;
    private Boolean whitesTurn = true;

    public Chess() {
        panel = new Panel();
        panel.setVisible(true);
    }

    public void endGame() {
        panel.dispose();
    }
}
