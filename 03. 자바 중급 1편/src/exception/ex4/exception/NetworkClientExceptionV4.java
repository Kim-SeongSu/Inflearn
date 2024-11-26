package exception.ex4.exception;

// Exception -> RuntimeException
public class NetworkClientExceptionV4 extends RuntimeException {
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
