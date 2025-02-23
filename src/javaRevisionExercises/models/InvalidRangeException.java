package javaRevisionExercises.models;

public class InvalidRangeException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Invalid range ERROR.";

    public InvalidRangeException(String message) {
        super(DEFAULT_MESSAGE + " " + message);
    }

    public InvalidRangeException() {
        super(DEFAULT_MESSAGE);
    }
}
