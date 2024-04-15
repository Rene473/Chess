package chess_game.pieces;

import chess_game.Color;
import chess_game.Tile;

public class Rook extends Piece {

    public Rook(Color color) {
        super(PieceType.ROOK, color);
    }

    @Override
    public Boolean move(Tile newLocation) {
        return false;
    }
}
