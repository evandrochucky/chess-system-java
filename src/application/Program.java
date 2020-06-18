package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		
		//Classe User Interface
		UI.printBoard(chessmatch.getPieces());
		
		

	}

}
