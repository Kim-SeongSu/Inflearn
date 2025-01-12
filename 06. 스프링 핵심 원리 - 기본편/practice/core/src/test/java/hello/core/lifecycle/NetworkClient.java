package hello.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// 인터페이스를 사용한 방법 (초창기 방법: 거의 사용 안함)
//public class NetworkClient implements InitializingBean, DisposableBean {
public class NetworkClient {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
        // 초기화 부분은 분리하는걸 추천
        //connect();
        //call("초기화 연결 메시지");
    }

    // 서비스 시작시 호출
    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + " message = " + message);
    }

    // 서비스 종료시 호출
    public void disconnect() {
        System.out.println("close: " + url);
    }


    /**
     * 인터페이스 InitializingBean, DisposableBean
     *  - 스프링 전용 인터페이스에 의존
     *  - 이름 변경 불가
     */
    /*
    // DisposableBean - destroy: 메서드 소멸 지원
    @Override
    public void destroy() throws Exception {
        disconnect();
    }

    // InitializingBean - afterPropertiesSet: 메서드 초기화 지원
    @Override
    public void afterPropertiesSet() throws Exception {
        connect();
        call("초기화 연결 메시지");
    }
     */



    /**
     * 빈 등록 초기화, 소멸 메서드 지정
     *  - 메서드 이름을 자유롭게 줄 수 있다
     *  - 스프링 빈이 스프링 코드에 의존하지 않는다.
     */
    /*
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }
     */

    /**
     * 애노테이션 @PostConstruct, @PreDestroy    - 이 방법 가장 추천
     *  - 애노테이션 하나만 붙이면 되므로 매우 편리
     *  - 스프링이 아닌 다른 컨테이너에서도 동작
     *  - 컴포넌트 스캔과 잘 어울린다.
     *  - 유일한 단점은 외부 라이브러리에는 적용하지 못한다는 것 (초기화, 종료해야 하면 @Bean 의 initMethod , destroyMethod 를 사용)
     */
    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }

}
