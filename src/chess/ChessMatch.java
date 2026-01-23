package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				Piece p = board.piece(i, j);
				if (p instanceof ChessPiece) {
					mat[i][j] = (ChessPiece) p;
				} else {
					mat[i][j] = null; 
				}
			}
		}

		return mat;
	}

}
