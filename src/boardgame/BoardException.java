package boardgame;

public class BoardException extends RuntimeException {

	/** para ser uma exceção opcional de ser tratada fazemos estendemos da RunTimeException
	 *  Informamos a versão default (nro 1) para a serialização.
	 */
	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		super(msg);
	}
}
