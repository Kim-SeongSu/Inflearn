# 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술

**[ 목차 ]**

> *01.* **스프링 웹 개발 기초** [🔍]()

ㅤㅤ\+ **회원 관리 예제 - 백엔드 개발** <br>

> *02.* **스프링 빈과 의존관계** [🔍]() 

ㅤㅤ\+  **회원 관리 예제 - 웹 MVC 개발** <br>

> *03.* **스프링 DB 접근 기술** [🔍]() 

> *04.* **AOP** [🔍]()
> 
##

<br>

> [!TIP]
> 🔆 **IntelliJ의 단축키 정리!**

```java
01. 빠른 코드 실행: Ctrl + shift + F10   /  이전 명령 재 실행: shift + F10
02. 줄 전체 복사: Ctrl + D
03. 오류 해결 제안: Alt + Enter
    - 클래스명 수정 (Rename File)
04. 메서드 위치로 이동: 메서드 이름 클릭 + Ctrl + B
05. 한번에 변수 변경: shift + F6
06. 자동 완성 기능: Ctrl + Alt + V
    - 반환 메서드 이름 자동 완성
    - 참조 클래스 자동 완성 (`new 클래스명` 까지 입력 후 단축키)
07. 파라미터 정보: Ctrl + P
08. Generate 기능: Alt + Insert
    - Constructor (생성자) 자동 생성
    - toString() 자동 생성
    - equals() / equals() and hashCode 자동 생성
    - Setter / Getter (get 입력 후 선택 가능) / Getter and Setter 자동 생성
09. 단어 전체 선택: Ctrl + W
10. Override: Ctrl + O
11. 메서드 추출(extract): 메서드로 생성하고 싶은 영역 드래그 →  Ctrl + Alt + M → 메서드 이름 지정
12. Inline Variable (변수 & 코드 합치기): Ctrl + Alt + N
13. 메서드 위치 바꾸기: Ctrl + Shift + 방향키 (위, 아래)
13. 오류 위치로 이동: F2
14. (new) 코드 완성: Ctrl + shift + Enter
15. (new) [스프링] 테스트 생성: Ctrl + shift + T
```
<br><br>


> [!TIP]
> 🔆 **Spring Annotation 정리!**

```java
@SpringBootApplication: Spring Boot를 자동으로 실행시켜주는 애노테이션
    1. @ComponentScan을 통해 Component들을 Bean으로 등록하는 방법
    2. @EnableAutoConfiguration을 통해 미리 정의해둔 자바 설정 파일들을 Bean으로 등록

@Configuration: IoC Container에게 해당 클래스가 "Bean 구성 Class"임을 알려주는 애노테이션 (@Bean이 붙은 메서드를 Bean으로 등록)
    - @Bean: 발자가 직접 제어가 불가능한 외부 라이브러리 등을 Bean으로 만들 때 사용 
    - @Autowired: 필드, setter 메소드, 생성자에 사용하며 Type에 따라 알아서 Bean을 주입해주는 역할. 객체에 대한 의존성을 주입
        @Resource: @Autowired와 마찬가지로 Bean 객체를 주입하는 역할 수행. 이름을 기준으로 연결


@ComponentScan: @Component, @Service, @Repository, @Controller, @Configuration이 붙은 Bean들을 찾아서 Context에 Bean 자동 등록
@Component: 개발자가 직접 작성한 Class를 Bean으로 등록 (메서드가 아닌 클래스 단위. 하위 패키지 까지)
    @Repository: DB관련 로직을 처리하는 계층에 붙이는 애노테이션
    @Service: 비즈니스 로직을 처리하는 계층에 붙이는 애노테이션 (특별한 기능은 없고 사실상 주석의 역할)
    @Controller: Spring MVC의 Controller로 사용되는, 클래스 선언을 단순화 시켜주는 애노테이션. VIEW를 리턴.
        @@RestController: View로 응답하지 않는 Controller. @Controller + @ResponseBody (JSON 형태로 반환 = @ResponseBody 역할도 수행)    
        @ResponseBody: 뷰 리졸버(viewResolver)를 사용하지 않음 (HTTP의 BODY에 문자 내용을 직접 반환, API 사용시 필수)
        @RequestMapping: 어떤 URL을 어떤 method가 처리할 지 매핑

@PostMapping: 데이터를 form같은 곳에 넣어서 전달할 때 사용
@GetMapping: 데이터를 조회할 때 사용
@PutMapping
@DeleteMapping    


@Test: 테스트 생성
    @AfterEach: 각 테스트 실행 후 호출
    @BeforeEach: 각 테스트 실행 전에 호출
    @SpringBootTest : 스프링 컨테이너와 테스트를 함께 실행
    @Transactional: 테스트 시작 전에 트랜잭션을 시작하고, 테스트 완료 후에 항상 롤백

@PreConstruct, @PostConstruct: 의존하는 객체를 생성한 이후 초기화 작업을 위해 객체 생성 전이나 후에 실행해야 할 메서드에 사용
@PreDestroy: 객체를 제거하기 전에 해야할 작업을 수행하기 위해 사용

@Override: 오버라이드할 때 사용
@Aspect
@Around


@Entity
@Id
@GeneratedValue

```

참고하면 좋은 [블로그](https://velog.io/@rara_kim/Spring-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98Annotation)
