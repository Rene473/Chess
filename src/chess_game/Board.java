package chess_game;

import chess_game.pieces.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {

    private final ArrayList<Piece> whitePieces = new ArrayList<>();
    private final ArrayList<Piece> blackPiece = new ArrayList<>();
    private final Tile[][] board = new Tile[8][8];

    public Board() {

        this.setLayout(new GridLayout(8,8));

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                this.add(new Tile(x, y));
            }
        }

//        for (int x = 0; x < board.length; x++) {
//            for (int y = 0; y < board.length; y++) {
//                if (y == 1) {
//                    Pawn pawn = new Pawn(Color.WHITE);
//                    whitePieces.add(pawn);
//                    board[x][y] = new Tile(x, y);
//                    board[x][y].setPiece(pawn);
//                } else if(y == 6) {
//                    Pawn pawn = new Pawn(Color.BLACK);
//                    blackPiece.add(pawn);
//                    board[x][y] = new Tile(x, y);
//                    board[x][y].setPiece(pawn);
//                } else {
//                    board[x][y] = new Tile(x, y);
//                }
//            }
//        }
    }
}
