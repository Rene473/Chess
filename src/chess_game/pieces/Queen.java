package chess_game.pieces;

import chess_game.Color;
import chess_game.Tile;

public class Queen extends Piece {

    public Queen(Color color) {
        super(PieceType.QUEEN, color);
    }

    @Override
    public Boolean move(Tile newLocation) {
        return false;
    }
}
