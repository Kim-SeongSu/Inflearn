package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrow(); // 예외를 main 메서드 밖으로 나가면서 에러코드 출력하고 정상 종료 안됨
        System.out.println("정상 종료");
    }
}
