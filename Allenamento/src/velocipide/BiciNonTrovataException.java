package velocipide;

public class BiciNonTrovataException extends Exception {
	private static final long serialVersionUID = 1L;

	public BiciNonTrovataException(String messaggio) {
		super(messaggio);
	}
}
