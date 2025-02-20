package exception;

public class PasswordException extends LoginException {
	public PasswordException() {
		super();
	}
	public PasswordException(String message) {
		super(message);
	}
}