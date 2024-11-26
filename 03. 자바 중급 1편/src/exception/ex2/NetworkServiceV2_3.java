package exception.ex2;

// 정상, 예외 흐름 분기
// 하나의 try 안에 정상 흐름을 모두 담고, 예외 부분은 catch 블럭에서 해결한다.
public class NetworkServiceV2_3 {
    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        // 정상 흐름
        try {
            client.connect();
            client.send(data);
            client.disconnect();

            // 예외 부분
        } catch (NetworkClientExceptionV2 e) {
            System.out.printf("[오류] 코드: ,%s, 메시지: %s\n", e.getErrorCode(),e.getMessage());
        }
    }
}