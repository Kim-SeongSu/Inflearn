package exception.ex1;

// 요청사항: "연결 실패" 및 "전송 실패" 오류 상황 발생 가정
public class NetworkServiceV1_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
