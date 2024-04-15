package chess_game;

public enum Color {
    WHITE("White"),
    BLACK("Black");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
