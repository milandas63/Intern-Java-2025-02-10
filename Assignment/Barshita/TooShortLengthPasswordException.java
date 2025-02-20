package exception;

public class TooShortLengthPasswordException extends LoginException {
	public TooShortLengthPasswordException() {
		super();
	}
	public TooShortLengthPasswordException(String message) {
		super(message);
	}
}