package HomeWorkApp;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        System.out.println("Size of Array is not valid...");
    }

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }
}
