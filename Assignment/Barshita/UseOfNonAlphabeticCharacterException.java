package exception;

public class UseOfNonAlphabeticCharacterException extends UsernameException {
	public UseOfNonAlphabeticCharacterException() {
		super();
	}
	public UseOfNonAlphabeticCharacterException(String message) {
		super(message);
	}
}