package exception;

public class UsernameException extends LoginException {
	public UsernameException() {
		super();
	}
	public UsernameException(String message) {
		super(message);
	}
}