package hello.servlet.web.springmvc.old;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


@Component("/springmvc/old-controller")
public class OldController implements Controller {

    /*
    // spring mvc를 이용한 핸들러 초기 구현 (ModelAndView 사용)
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return null;
    }
     */

    // view 리졸버 추가 구현
    /** resources >> application.properties에 다음 코드 추가
     *  spring.mvc.view.prefix=/WEB-INF/views/
     *  spring.mvc.view.suffix=.jsp
     *
     *  스프링 부트는 InternalResourceViewResolver 라는 뷰 리졸버를 자동으로 등록하는데,
     *  application.properties에 등록한 spring.mvc.view.prefix , spring.mvc.view.suffix 설정 정보를 사용해서 등록
     **/
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return new ModelAndView("new-form");    // view 사용
    }
}
