package boardgame;

public class BoardException extends RuntimeException {

	/** para ser uma exce��o opcional de ser tratada fazemos estendemos da RunTimeException
	 *  Informamos a vers�o default (nro 1) para a serializa��o.
	 */
	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		super(msg);
	}
}
