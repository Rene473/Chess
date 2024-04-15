package chess_game.pieces;

import chess_game.Color;
import chess_game.Tile;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(PieceType.BISHOP, color);
    }

    @Override
    public Boolean move(Tile newLocation) {
        return false;
    }
}
