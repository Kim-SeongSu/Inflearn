package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    /**
     * 수정 전
     */
    /*
    private final MyLogger myLogger;

    public void logic(String id) {
        myLogger.log("service id = " + id);
    }
     */

    /**
     * provider 사용
     */
    private final ObjectProvider<MyLogger> myLoggerObjectProvider;

    public void logic(String id) {
        MyLogger myLogger = myLoggerObjectProvider.getObject();
        myLogger.log("service id = " + id);
    }
}
