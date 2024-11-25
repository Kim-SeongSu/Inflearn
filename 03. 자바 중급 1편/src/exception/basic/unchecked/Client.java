package exception.basic.unchecked;

public class Client {
    // public void call() throws MyUncheckedException 생략 가능
    public void call()  {
        throw new MyUncheckedException("ex");
    }
}
