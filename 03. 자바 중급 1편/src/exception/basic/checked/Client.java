package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException { // throws: 예외 메서드 밖으로 던지는 키워드

        // throw: 예외 발생 시키는 키워드
        throw new MyCheckedException("ex");
    }
}
