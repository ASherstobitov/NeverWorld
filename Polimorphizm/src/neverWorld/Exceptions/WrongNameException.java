package neverWorld.Exceptions;

import neverWorld.Exceptions.NeverWorldException;

public class WrongNameException extends NeverWorldException {
    public WrongNameException() {
        super("wrong name character");
    }

    public WrongNameException(String message) {
        super(message);
    }
}
