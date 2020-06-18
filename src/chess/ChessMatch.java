package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		// aqui se define o tamanho do tabuleiro do xadrez
		// inicia a partida
		board = new Board(8,8);
		initialSetup();
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

	private void initialSetup() {
		//Respons�vel por iniciar o jogo colocando as pe�as no tabuleiro
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
	}
	
	
}
