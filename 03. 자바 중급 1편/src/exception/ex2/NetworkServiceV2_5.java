package exception.ex2;

// 리소스 반환 문제 - (finally로 disconnect()를 항상 호출)
// try , catch 안에서 잡을 수 없는 예외가 발생해도 finally 는 반드시 호출
public class NetworkServiceV2_5 {
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
        } finally {
            client.disconnect();
        }
    }
}

/*
// 결과
전송할 문자: error2
http://example.com 서버 연결 성공
http://example.com 서버 연결 해제  // finally 구문 작동
Exception in thread "main" java.lang.RuntimeException: ex
	at exception.ex2.NetworkClientV2.send(NetworkClientV2.java:25)
	at exception.ex2.NetworkServiceV2_5.sendMessage(NetworkServiceV2_5.java:15)
	at exception.ex2.MainV2.main(MainV2.java:20)
 */