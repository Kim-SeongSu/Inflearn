package hello.springmvc.basic.request;

import hello.springmvc.basic.HelloData;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;


// 요청 파라미터(request parameter) 조회
@Slf4j
@Controller
public class RequestParamController {


    /**
     * request parameter ver.1
     * 반환 타입이 없으면서 이렇게 응답에 값을 직접 집어넣으면, view 조회X
     */
    @RequestMapping("/request-param-v1")
    public void requestParamV1(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        log.info("username={}, age={}", username, age);

        response.getWriter().write("ok");
    }


    /**
     * request parameter ver.2
     *
     * @RequestParam 사용 (파라미터 이름으로 바인딩)
     * @ResponseBody 추가 ( View 조회를 무시하고, HTTP message body에 직접 해당 내용 입력)
     */
    @ResponseBody
    @RequestMapping("/request-param-v2")   // (이 버전으로 사용 추천 - 너무 축약해도 직관성 떨어짐 & 스프링 부트 3.2 파라미터 이름 인식 문제 발생)
    public String requestParamV2(@RequestParam("username") String memberName,
                                 @RequestParam("age") int memberAge) {
        log.info("username={}, age={}", memberName, memberAge);
        return "ok";
    }


    /**
     * request parameter ver.3
     *
     * @RequestParam 사용
     * -  HTTP 파라미터 이름이 변수 이름과 같으면 @RequestParam(name="xx") 생략 가능
     */
    @ResponseBody
    @RequestMapping("/request-param-v3")
    public String requestParamV3(@RequestParam String username,
                                 @RequestParam int age) {
        log.info("username={}, age={}", username, age);
        return "ok";
    }


    /**
     * request parameter ver.4
     *
     * @RequestParam 사용
     * -  String, int, Integer 등의 단순 타입이면 @RequestParam도 생략 가능
     */
    @ResponseBody
    @RequestMapping("/request-param-v4")
    public String requestParamV4(String username, int age) {
        log.info("username={}, age={}", username, age);
        return "ok";
    }


    /**
     * request parameter 옵션 - 파라미터 필수 여부
     *
     * @RequestParam(required = true) : 기본값. 파라미터 필수
     * false: 필수 아님
     * <p>
     * !! 주의할 점 !!
     * 만약 파라미터 이름만 있고 값이 없는 경우 (ex. /request-param-required?username=)
     * <p>
     * - @RequestParam(required = false) int age
     * 기본형(primitive)인 int에 null 값이 입력되면 500 예외 발생한다.
     * 따라서 null을 받을 수 있는 Integer로 변경하거나 defaultValue 사용해야 한다.
     */
    @ResponseBody
    @RequestMapping("/request-param-required")
    public String requestParamRequired(
            @RequestParam(required = true) String username,
            @RequestParam(required = false) Integer age) {
        log.info("username={}, age={}", username, age);
        return "ok";
    }


    /**
     * request parameter 옵션 - 파라미터 기본 값 적용
     * defaultValue는 빈 문자의 경우에도 적용
     * /request-param-default?username= 처럼 빈 문자에 어떤 값을 넣을지 미리 지정 가능함
     */
    @ResponseBody
    @RequestMapping("/request-param-default")
    public String requestParamDefault(
            @RequestParam(required = true, defaultValue = "guest") String username,
            @RequestParam(required = false, defaultValue = "-1") Integer age) {
        log.info("username={}, age={}", username, age);
        return "ok";
    }


    /**
     * request parameter 옵션 - 파라미터를 Map으로 조회
     *
     * @RequestParam Map, MultiValueMap
     * <p>
     * 파라미터 값이 1개가 확실할 때는 Map사용, 복수의 파라미터를 사용한다면 MultiValueMap 사용
     * - MultiValueMap(key=[value1, value2, ...])
     * ex)  (key=userIds, value=[id1, id2])
     */
    @ResponseBody
    @RequestMapping("/request-param-map")
    public String requestParamMap(@RequestParam Map<String, Objects> paramMap) {
        log.info("username={}, age={}", paramMap.get("username"), paramMap.get("age"));
        return "ok";
    }


    /** ModelAttribute 적용 ver 1.
     * @ModelAttribute 사용
     * model.addAttribute(helloData) 코드도 함께 자동 적용됨
     */
    @ResponseBody
    @RequestMapping("/model-attribute-v1")
    public String modelAttributeV1(@ModelAttribute HelloData helloData) {
        log.info("username={}, age={}", helloData.getUsername(), helloData.getAge());
        return "ok";
    }


    /** ModelAttribute 적용 ver 2.
     *  @ModelAttribute 생략 가능
     *   - 마찬가지로 생략 가능한 @RequestParam와 구분하기 위해 스프링에서는
     *          String, int 같은 단순 타입이 생략된 경우는 @RequestParam로 인식
     *          그 외의 내가 만든 타입(argument resolver로 지정해둔 타입 외)은 @ModelAttribute로 인식
     */
    @ResponseBody
    @RequestMapping("/model-attribute-v2")
    public String modelAttributeV2(HelloData helloData) {
        log.info("username={}, age={}", helloData.getUsername(), helloData.getAge());
        return "ok";
    }
}
