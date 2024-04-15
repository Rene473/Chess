public enum Type {
    private String pieceType;

    Pawn("Pawn"),
    Rook("Rook"),
    Bishop("Bishop"),
    Knight("Knight"),
    King("King"),
    Queen("Queen");

    Type(String pieceType) {
        this.pieceType = pieceType;
    }

    public String getType() {
        return pieceType;
    }
}
