package hello.springmvc.basic.request;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

@Slf4j
@Controller
public class RequestBodyStringController {

    /** HTTP 요청 메시지 - 단순 텍스트 ver 1.
     *  - HTTP message body에 데이터를 직접 담아서 요청
     */
    @PostMapping("/request-body-string-v1")
    public void requestBodyString(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        log.info("messageBody={}", messageBody);

        response.getWriter().write("ok");
    }


    /** HTTP 요청 메시지 - 단순 텍스트 ver 2.
     * InputStream(Reader): HTTP 요청 메시지 바디의 내용을 직접 조회
     * OutputStream(Writer): HTTP 응답 메시지의 바디에 직접 결과 출력
     */
    @PostMapping("/request-body-string-v2")
    public void requestBodyStringV2(InputStream inputStream, Writer responseWriter) throws IOException {

        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        log.info("messageBody={}", messageBody);

        responseWriter.write("ok");
    }


    /** HTTP 요청 메시지 - 단순 텍스트 ver 3.
     * HttpEntity: HTTP header, body 정보를 편리하게 조회
     *   - 메시지 바디 정보를 직접 조회 (@RequestParam X, @ModelAttribute X)
     *   - HttpMessageConverter 사용 -> StringHttpMessageConverter 적용
     *
     *  응답에서도 HttpEntity 사용 가능
     *   - 메시지 바디 정보 직접 반환 (view 조회X)
     *   - HttpMessageConverter 사용 -> StringHttpMessageConverter 적용
     *
     *
     *   HttpEntity를 상속받은 다음 객체들도 같은 기능 제공
     *   - RequestEntity: HttpMethod, url 정보가 추가, 요청에서 사용
     *   - ResponseEntity: HTTP 상태 코드 설정 가능, 응답에서 사용
     */
    @PostMapping("/request-body-string-v3")
    public HttpEntity<String> requestBodyStringV3(HttpEntity<String> httpEntity) {

        String messageBody = httpEntity.getBody();

        log.info("messageBody={}", messageBody);

        return new HttpEntity<>("ok");
    }


    /** HTTP 요청 메시지 - 단순 텍스트 ver 4.  (실무에서 가장 많이 사용!!!)
     * @RequestBody
     * - 메시지 바디 정보를 직접 조회(@RequestParam X, @ModelAttribute X)
     * - HttpMessageConverter 사용 -> StringHttpMessageConverter 적용
     *
     * @ResponseBody
     * - 메시지 바디 정보 직접 반환(view 조회X)
     * - HttpMessageConverter 사용 -> StringHttpMessageConverter 적용
     */
    @ResponseBody
    @PostMapping("/request-body-string-v4")
    public String requestBodyStringV4(@RequestBody String messageBody) {

        log.info("messageBody={}", messageBody);

        return "ok";
    }
}