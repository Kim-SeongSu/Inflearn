package exception.ex2;

// 예외 복구 하기 (try-catch)
public class NetworkServiceV2_2 {
    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        // connect 부분 예외처리
        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.printf("[오류] 코드: ,%s, 메시지: %s\n", e.getErrorCode(),e.getMessage());
            return;
        }

        // send 부분 예외처리
        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.printf("[오류] 코드: ,%s, 메시지: %s\n", e.getErrorCode(),e.getMessage());
            return;
        }
        client.disconnect();
    }
}