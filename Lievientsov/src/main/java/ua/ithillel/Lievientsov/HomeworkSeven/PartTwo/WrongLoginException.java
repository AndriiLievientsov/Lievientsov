package ua.ithillel.Lievientsov.HomeworkSeven.PartTwo;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
