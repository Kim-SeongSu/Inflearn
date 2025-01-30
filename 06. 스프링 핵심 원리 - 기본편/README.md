# 스프링 핵심 원리 - 기본편

**[ 목차 ]**

> *01.* **객체 지향 설계와 스프링** [🔍](https://github.com/Kim-SeongSu/Inflearn/blob/main/06.%20%EC%8A%A4%ED%94%84%EB%A7%81%20%ED%95%B5%EC%8B%AC%20%EC%9B%90%EB%A6%AC%20-%20%EA%B8%B0%EB%B3%B8%ED%8E%B8/01.%20%EA%B0%9D%EC%B2%B4%20%EC%A7%80%ED%96%A5%20%EC%84%A4%EA%B3%84%EC%99%80%20%EC%8A%A4%ED%94%84%EB%A7%81.md)

ㅤㅤ\+ **스프링 핵심 원리 이해1 - 예제 만들기** <br>
ㅤㅤ\+ **스프링 핵심 원리 이해2 - 객체 지향 원리 적용** <br>

> *02.* **스프링 컨테이너와 스프링 빈** [🔍](https://github.com/Kim-SeongSu/Inflearn/blob/main/06.%20%EC%8A%A4%ED%94%84%EB%A7%81%20%ED%95%B5%EC%8B%AC%20%EC%9B%90%EB%A6%AC%20-%20%EA%B8%B0%EB%B3%B8%ED%8E%B8/02.%20%EC%8A%A4%ED%94%84%EB%A7%81%20%EC%BB%A8%ED%85%8C%EC%9D%B4%EB%84%88%EC%99%80%20%EC%8A%A4%ED%94%84%EB%A7%81%20%EB%B9%88.md) 

> *03.* **싱글톤 컨테이너** [🔍](https://github.com/Kim-SeongSu/Inflearn/blob/main/06.%20%EC%8A%A4%ED%94%84%EB%A7%81%20%ED%95%B5%EC%8B%AC%20%EC%9B%90%EB%A6%AC%20-%20%EA%B8%B0%EB%B3%B8%ED%8E%B8/03.%20%EC%8B%B1%EA%B8%80%ED%86%A4%20%EC%BB%A8%ED%85%8C%EC%9D%B4%EB%84%88.md) 

> *04.* **컴포넌트 스캔** [🔍](https://github.com/Kim-SeongSu/Inflearn/blob/main/06.%20%EC%8A%A4%ED%94%84%EB%A7%81%20%ED%95%B5%EC%8B%AC%20%EC%9B%90%EB%A6%AC%20-%20%EA%B8%B0%EB%B3%B8%ED%8E%B8/04.%20%EC%BB%B4%ED%8F%AC%EB%84%8C%ED%8A%B8%20%EC%8A%A4%EC%BA%94.md)

> *05.* **의존관계 자동 주입** [🔍](https://github.com/Kim-SeongSu/Inflearn/blob/main/06.%20%EC%8A%A4%ED%94%84%EB%A7%81%20%ED%95%B5%EC%8B%AC%20%EC%9B%90%EB%A6%AC%20-%20%EA%B8%B0%EB%B3%B8%ED%8E%B8/05.%20%EC%9D%98%EC%A1%B4%EA%B4%80%EA%B3%84%20%EC%9E%90%EB%8F%99%20%EC%A3%BC%EC%9E%85.md)

> *06.* **빈 생명주기 콜백** [🔍](https://github.com/Kim-SeongSu/Inflearn/blob/main/06.%20%EC%8A%A4%ED%94%84%EB%A7%81%20%ED%95%B5%EC%8B%AC%20%EC%9B%90%EB%A6%AC%20-%20%EA%B8%B0%EB%B3%B8%ED%8E%B8/06.%20%EB%B9%88%20%EC%83%9D%EB%AA%85%EC%A3%BC%EA%B8%B0%20%EC%BD%9C%EB%B0%B1.md)

> *07.* **빈 스코프** [🔍](https://github.com/Kim-SeongSu/Inflearn/blob/main/06.%20%EC%8A%A4%ED%94%84%EB%A7%81%20%ED%95%B5%EC%8B%AC%20%EC%9B%90%EB%A6%AC%20-%20%EA%B8%B0%EB%B3%B8%ED%8E%B8/07.%20%EB%B9%88%20%EC%8A%A4%EC%BD%94%ED%94%84.md)

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
14. 코드 완성: Ctrl + shift + Enter
15. [스프링] 테스트 생성: Ctrl + shift + T
```
<br>

> [!TIP]
> 🔆 **Spring Annotation 정리!**

```java
# 실행
@SpringBootApplication: Spring Boot를 자동으로 실행시켜주는 애노테이션
    1. @ComponentScan을 통해 Component들을 Bean으로 등록하는 방법
    2. @EnableAutoConfiguration을 통해 미리 정의해둔 자바 설정 파일들을 Bean으로 등록

# 설정
@Configuration: IoC Container에게 해당 클래스가 "Bean 구성 Class"임을 알려주는 애노테이션 (@Bean이 붙은 메서드를 Bean으로 등록)
    - @Bean: 스프링 컨테이너에 스프링 빈으로 등록. 개발자가 직접 제어가 불가능한 외부 라이브러리 등을 Bean으로 만들 때 사용 
    - @Autowired: 필드, setter 메소드, 생성자에 사용하며 Type에 따라 알아서 Bean을 주입해주는 역할. 객체에 대한 의존성을 주입
        @Resource: @Autowired와 마찬가지로 Bean 객체를 주입하는 역할 수행. 이름을 기준으로 연결


# 스캔
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

@Scope: 빈이 존재할 수 있는 범위 설정 ("singleton" / "prototype" / value = "request" / proxyMode = ScopedProxyMode.TARGET_CLASS 등)


# 테스트
@Test: 테스트 생성
    @AfterEach: 각 테스트 실행 후 호출
    @BeforeEach: 각 테스트 실행 전에 호출
    @SpringBootTest : 스프링 컨테이너와 테스트를 함께 실행
    @Transactional: 테스트 시작 전에 트랜잭션을 시작하고, 테스트 완료 후에 항상 롤백

# 기능
@Override: 오버라이드할 때 사용
@Aspect: Advisor(어드바이저) 클래스 지정
@Around: Pointcut으로 Advice를 적용할 대상을 지정
@DisplayName("출력 내용 입력"): 테스트의 출력 내용을 입력한다.

@PreConstruct, @PostConstruct: 의존하는 객체를 생성한 이후 초기화 작업을 위해 객체 생성 전이나 후에 실행해야 할 메서드에 사용
@PreDestroy: 객체를 제거하기 전에 해야할 작업을 수행하기 위해 사용
@Qualifier: 추가 구분자를 붙여주는 방법 (빈 등록 / 생성자 자동 주입 / 수정자 자동 주입)
@Primary: 우선순위를 정하는 방법. @Autowired 시에 여러 빈이 매칭되면 @Primary가 우선권을 가짐
    * @Primary 는 기본값 처럼 동작하는 것이고, @Qualifier 는 매우 상세하게 동작. @Qualifier 가 우선권이 높다.


@Entity: 실제 DB 테이블과 매핑될 Class 나타냄
@Id: 해당 테이블의 PK 필드
@GeneratedValue: PK의 생성 규칙

@interface: Java에서 제공하는 어노테이션 외에 사용자가 커스텀하여 사용할 수 있는 어노테이션.
@Target: @interface 어노테이션의 적용 위치를 설정하는 옵션
@Retention: @interface 어노테이션의 적용범위로 어떤 시점까지 사용될 지 결정하는 옵션
@Documented: javadoc에 해당 어노테이션을 javadoc에 표기할지 에 대한 여부를 지정



# 라이브러리
@RequiredArgsConstructor: 롬복 라이브러리가 제공하는 기능.  final이 붙은 필드를 모아서 생성자를 자동으로 만들어 줌.
```

<br>

**[ 수료 ]**

![image](https://github.com/user-attachments/assets/028bd421-4d4c-43f2-9104-3078d2b605ea)

