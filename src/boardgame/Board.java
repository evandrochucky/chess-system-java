package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			//Programa��o defensiva... gerar uma exce��o quando n�o ouver linha ou coluna
			throw new BoardException("Error creating board: There must be at least 1 row and 1 column.");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}
	
	/* Uma vez o tabuleiro criado, a linha n�o pode ser alterada 
	public void setRows(int rows) {
		this.rows = rows;
	}
	*/

	public int getColumns() {
		return columns;
	}

	/* Uma vez o tabuleiro criado, a coluna n�o pode ser alterada
	public void setColumns(int columns) {
		this.columns = columns;
	}
	*/
	
	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board.");
		}
		return pieces[row][column];
	}
	
	//sobrecarga retornando a pe�a pela posi��o.
	public Piece piece(Position position) {
 		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public Piece removePiece(Position position) {
 		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
 		if(piece(position) == null) {
 			return null;
 		}
 		Piece aux = piece(position);
 		aux.position = null;
 		pieces[position.getRow()][position.getColumn()] = null;
 		return aux;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
		
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		return piece(position) != null;
	}

}
