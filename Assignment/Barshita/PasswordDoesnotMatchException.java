package exception;

public class PasswordDoesnotMatchException extends LoginException {
	public PasswordDoesnotMatchException() {
		super();
	}
	public PasswordDoesnotMatchException(String message) {
		super(message);
	}
}