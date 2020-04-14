package neverWorld.Exceptions;

public class WrongTypeException extends NeverWorldException {
    public WrongTypeException() {
        super("Wrong type");
    }

    public WrongTypeException(String message) {
        super(message);
    }
}
