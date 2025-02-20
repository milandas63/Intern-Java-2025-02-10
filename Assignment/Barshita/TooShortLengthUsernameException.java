package exception;

public class TooShortLengthUsernameException extends UsernameException {
	public TooShortLengthUsernameException() {
		super();
	}
	public TooShortLengthUsernameException(String message) {
		super(message);
	}
}