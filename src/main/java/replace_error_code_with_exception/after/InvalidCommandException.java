package replace_error_code_with_exception.after;

public class InvalidCommandException extends Exception {

	public InvalidCommandException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidCommandException(String name) {
		super(name);
	}
	
}
