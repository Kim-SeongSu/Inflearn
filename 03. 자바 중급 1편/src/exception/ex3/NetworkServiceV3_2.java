package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientV3;
import exception.ex3.exception.SendExceptionV3;

// ConnectExceptionV3 , SendExceptionV3 이 발생한 각각의 경우에 출력된 오류 메시지
public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

            // 여러 예외를 한번에 잡는 기능
            //} catch (ConnectExceptionV3 | SendExceptionV3 e) {
            //  System.out.printf("[연결 또는 전송 오류] 주소: , 메시지: %s\n", e.getMessage());
        } catch (ConnectExceptionV3 e) {
            System.out.printf("[연결 오류] 주소: %s, 메시지: %s\n", e.getAddress(), e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.printf("[전송 오류] 전송 데이터: %s, 메시지: %s\n",e.getSendData(), e.getMessage());
        } catch (Exception e) {
            System.out.printf("[알 수 없는 오류] 메시지: %s\n", e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}