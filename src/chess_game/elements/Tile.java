package chess_game.elements;

import chess_game.pieces.Piece;

import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {
    private final int x;
    private final int y;
    private Piece piece;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
        this.piece = null;

        this.setMinimumSize(new Dimension(Panel.FRAME_SIZE/8, Panel.FRAME_SIZE/8));

        if((x%2 == 1 && y%2 == 1) || (x%2 == 0 && y%2 == 0)) {
            this.setBackground(Color.WHITE);
        } else if((x%2 == 1 && y%2 == 0) || (x%2 == 0 && y%2 == 1)) {
            this.setBackground(Color.BLACK);
        }
    }

    public Tile(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;

        if(x%2 == 0 && y%2 == 1) {
            this.setBackground(Color.WHITE);
        } else {
            this.setBackground(Color.BLACK);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void removePiece() {
        this.piece = null;
    }

    @Override
    public String toString() {
        return piece.toString() + "at [" + x + ", " + y +"]";
    }
}
