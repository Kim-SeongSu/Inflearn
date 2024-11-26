package exception.ex2;

// 예외 밖으로 던지기 (main() 밖까지)
public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
// 정상 흐름과 예외 흐름이 전혀 분리되어 있지 않다. 어떤 부분이 정상 흐름이고 어떤 부분이 예외 흐름인지 이해하기가 너무 어렵다.