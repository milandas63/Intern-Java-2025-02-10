package exception;

public class TooLongLengthPasswordException extends PasswordException {
	public TooLongLengthPasswordException() {
		super();
	}
	public TooLongLengthPasswordException(String message) {
		super(message);
	}
}