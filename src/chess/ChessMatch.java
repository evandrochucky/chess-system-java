package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		// aqui se define o tamanho do tabuleiro do xadrez
		board = new Board(8,8);
	}
	
	// processo para retornar a matriz de pe�as da partida de xadrez
	public ChessPiece [][] getPieces(){
		ChessPiece[][] mat  =  new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				//downcasting (ChessPiece) para ele entender que trata-se de uma pe�a do xadres e n�o de uma pe�a comum.
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

	
	
}
