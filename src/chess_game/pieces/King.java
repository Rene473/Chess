package chess_game.pieces;

import chess_game.Color;
import chess_game.elements.Tile;

public class King extends Piece {

    public King(Color color) {
        super(PieceType.KING, color);
    }

    @Override
    public Boolean move(Tile newLocation) {
        return false;
    }
}
