package exception;

public class TooLongLengthUsernameException extends UsernameException {
	public TooLongLengthUsernameException() {
		super();
	}
	public TooLongLengthUsernameException(String message) {
		super(message);
	}
}