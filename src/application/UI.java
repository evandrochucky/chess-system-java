package application;

import chess.ChessPiece;

public class UI {
	
	//Imprimir o Tabuleiro
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i=0; i<pieces.length; i++) {
			System.out.print((8-i) + " "); //nomeando linhas.
			for (int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println(); // para quebrar a linha.
		}
		System.out.println("  A B C D E F G H"); //nomeando columas.
	}

	//Imprimir uma peça do tabuleiro
	public static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
