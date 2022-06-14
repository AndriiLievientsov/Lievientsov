package ua.ithillel.Lievientsov.HomeworkSeven.PartTwo;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
