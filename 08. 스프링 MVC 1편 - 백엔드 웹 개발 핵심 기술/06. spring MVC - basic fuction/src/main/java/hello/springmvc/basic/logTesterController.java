package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logTesterController {

    // Slf4j 패키지의 Logger를 import 해야 함!
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // LEVEL 순서: TRACE > DEBUG > INFO > WARN > ERROR
        // ex1) TRACE를 선택하면 TRACE부터 ERROR까지 출력
        // ex2) logging.level.hello.springmvc=debug
        //     : hello.springmvc 패키지와 그 하위 로그를 DEBUG 단계부터 (ERROR까지) 출력하겠다.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);    // 개발 서버는 debug 출력
        log.info("info log= {}", name);     // 운영 서버는 info 출력
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        //log.info("info log= {}=" + name);         // log.info("info log= {}", name);와 결과는 같음. 하지만 사용하면 안됨!!!
        // 로그를 사용하지 않아도 a+b 계산 로직("String concat log=" + name)이 먼저 실행됨
        // 계산 로직(연산)이 발생하면서 리소스를 낭비함 (연산값 기억하느라 메모리 사용)
        // log.info("info log= {}", name);의 경우 파라미터를 넘기기 때문에 연산이 아니므로 (기억하기 위해) 메모리 사용하지 않음
        return "ok";
    }
}
