package neverWorld.Exceptions;

import neverWorld.Exceptions.NeverWorldException;

public class WrongDamageExceprion extends NeverWorldException {
    public WrongDamageExceprion() {
        super("Wrong damage");
    }

    public WrongDamageExceprion(String message) {
        super(message);
    }
}
