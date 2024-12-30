package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    // MVC - Controller
    @GetMapping("hello-mvc")
    // required = true가 default
    public String helloMvc(@RequestParam(value = "name", required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    // API
    @GetMapping("hello-string")
    @ResponseBody   // 뷰 리졸버( viewResolver )를 사용하지 않고 HTTP의 BODY에 문자 내용을 직접 반환
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /*
    "정적 컨텐츠"를 제외하고 딱 두 가지 방식만 기억하면 된다.
        1. 변환한 HTML 형식(XML)으로 반환하는 MVC 방식
        2. (Json 형식의)데이터를 바로 반환하는 API 방식

    <MVC 작동 과정>
    웹 브라우저에 "localhost:8080/hello-mvc"를 넘기면 스프링 부트 내장 톰켓 서버를 먼저 거침
    내장 톰켓 서버는 "hello-mvc" 라는 것이 들어왔다고 스프링에 전달
    스프링은 helloController의 메서드에 매핑이 되어있는 것을 확인 ( @GetMapping("hello-mvc") 부분) 및 해당 메서드 호출
    viewResolver(화면과 관련된 해결자; view를 찾아주고 템플릿 엔진을 연결시켜주는 역할)가 동작
        - 전달받은 return "hello-template" 의 이름을 갖는 템플릿(templates/hello-template.html)을 찾음
        - 찾은 템플릿을 Thymeleaf 템플릿 엔진에 처리해달라고 전달
        - Thymeleaf 템플릿 엔진이 렌더링을 해서 "변환 된 HTML"을 웹 브라우저에 반환



     <API 작동 과정>
    웹 브라우저에 "localhost:8080/hello-api"를 넘기면 스프링 부트 내장 톰켓 서버를 먼저 거침
    내장 톰켓 서버는 "hello-api" 라는 것이 들어왔다고 스프링에 전달
    스프링은 helloController의 메서드에 매핑이 되어있는 것을 확인 ( @GetMapping("hello-api") 부분) 및 해당 메서드 호출
        - @ResponseBody 가 붙은 것을 확인하고 viewResolver 대신 HttpMessageConverter가 동작
            - 문자가 오면 StringHttpMessageConverter(기본 문자처리) - StringConverter
            - 객체가 오면 MappingJackson2HttpMessageConverter(기본 객체처리) - JsonConverter(객체를 문자로 바꿔서(Json) 반환)
                - Jackson: Json으로 변환하는 라이브러리 (2는 버전)
    JSON 형식으로 반환


    [정리]
    정적 컨텐츠: 파일 그대로 반환
    MVC: 템플릿 엔진을 모델과 컨트롤러로 나눠서 뷰를 HTML로 프로그래밍 한 것을 렌더링하여 렌더링 된 HTML을 반환
    API: 객체를 (JSON형식으로 HTTP의 BODY에 바로) 반환
     */
}
