package exception.ex1;

// 요청사항: 오류 발생 시 오류 코드를 출력으로 남기고, 더이상 진행하지 못하게 중지
public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        // if (!resultCode.equals("success")) {      : 이 부분 중복  >>> 구문 선택 후, Ctrl + Alt + Shift + T >> Ctrl + Alt + M
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }

        client.send(data);
        client.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
