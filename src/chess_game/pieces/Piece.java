package chess_game.pieces;

import chess_game.Color;
import chess_game.Tile;

public abstract class Piece {

    private final PieceType PieceType;
    private final Color color;
    private Boolean alive = true;

    public Piece(PieceType PieceType, Color color) {
        this.PieceType = PieceType;
        this.color = color;
    }

    public abstract Boolean move(Tile newLocation);

    public Boolean isAlive() {
        return alive;
    }

    public void kill() {
        alive = false;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return PieceType.toString();
    }
}
