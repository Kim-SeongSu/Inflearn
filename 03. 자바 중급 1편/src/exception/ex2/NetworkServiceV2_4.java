package exception.ex2;

// 리소스 반환 문제 - (disconnect()를 항상 호출)
// >>> catch 에서 NetworkClientExceptionV2 은 잡을 수 있지만 새로 등장한 RuntimeException 은 잡을 수 없다.
public class NetworkServiceV2_4 {
    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        // 정상 흐름
        try {
            client.connect();
            client.send(data);

            // 예외 부분
        } catch (NetworkClientExceptionV2 e) {
            System.out.printf("[오류] 코드: ,%s, 메시지: %s\n", e.getErrorCode(),e.getMessage());
        }

        //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
        client.disconnect();
    }
}