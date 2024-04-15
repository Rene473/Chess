package chess_game.pieces;

public enum PieceType {
    PAWN("chess_game.pieces.Pawn"),
    ROOK("chess_game.pieces.Rook"),
    BISHOP("chess_game.pieces.Bishop"),
    KNIGHT("chess_game.pieces.Knight"),
    KING("chess_game.pieces.King"),
    QUEEN("chess_game.pieces.Queen");

    private final String pieceType;

    PieceType(String pieceType) {
        this.pieceType = pieceType;
    }

    @Override
    public String toString() {
        return pieceType;
    }
}
