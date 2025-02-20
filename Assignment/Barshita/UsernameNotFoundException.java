package exception;

public class UsernameNotFoundException extends UsernameException {
	public UsernameNotFoundException() {
		super();
	}
	public UsernameNotFoundException(String message) {
		super(message);
	}
}