package com.cauaofsouza.blindspot.model.exception;

public class DeathException extends Exception {
    public DeathException() {
    }

    public DeathException(String message) {
        super("Player morreu. Causa: " + message);
    }
}
