public abstract class Piece {

    private final PieceType PieceType;
    private Boolean alive = true;
    private final Color color;

    public Piece(PieceType PieceType, Color color) {
        this.PieceType = PieceType;
        this.color = color;
    }

    public abstract void move(Coordinate newLocation);

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
