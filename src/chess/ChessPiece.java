package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	/* a cor de uma pe�a n�o pode ser modificada
	public void setColor(Color color) {
		this.color = color;
	}
	*/
	
	
}
