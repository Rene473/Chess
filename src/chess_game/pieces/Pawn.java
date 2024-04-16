package chess_game.pieces;

import chess_game.Color;
import chess_game.elements.Tile;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(PieceType.PAWN, color);
    }

    @Override
    public Boolean move(Tile newLocation) {
        return false;
    }
}
