package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//we aren't create the contructor using position because when peace are created, your position is always null.
		//by default when we do not define position in constructor, java will define this with null. For educational way, we are putting this declaration here.
		position = null; 
	}

	//Somente classes dentro do mesmo pacote ou subclasses podem acessar o tabuleiro, 
	//por isso vamos deixar a definição do metrodo para protected
	protected Board getBoard() {
		return board;
	}

	/* Do not allow the board to be changed
	public void setBoard(Board board) {
		this.board = board;
	}
	*/
	
	
	

	
}
