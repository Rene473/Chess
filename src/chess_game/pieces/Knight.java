package chess_game.pieces;

import chess_game.Color;
import chess_game.elements.Tile;

public class Knight extends Piece {

    public Knight(Color color) {
        super(PieceType.KNIGHT, color);
    }

    @Override
    public Boolean move(Tile newLocation) {
        return false;
    }
}
