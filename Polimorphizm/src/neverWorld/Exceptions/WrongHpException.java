package neverWorld.Exceptions;

import neverWorld.Exceptions.NeverWorldException;

public class WrongHpException extends NeverWorldException {

    public WrongHpException() {
        super("Incorrect HP");
    }

    public WrongHpException(String message) {
        super(message);
    }
}
