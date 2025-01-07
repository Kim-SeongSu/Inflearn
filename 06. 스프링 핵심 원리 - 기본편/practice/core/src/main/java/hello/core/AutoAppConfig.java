package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core" // hello.core 부터 하위 패키지만 탐색, 다중 검색도 가능  = {"hello.core", "hello.service"}
        ,excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
// 컴포넌트 스캔을 사용하면 @Configuration 이 붙은 설정 정보도 자동으로 등록되므로
// excludeFilters로 AppConfig, TestConfig의 설정정보는 컴포넌트 스캔 대상에서 제외시킴
public class AutoAppConfig {

    /*
    // 수동 빈 등록 vs 자동 빈 등록 충돌 테스트
    @Bean(name = "memoryMemberRepository")  // memoryMemberRepository 와 같은 수동 빈 등록
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    // >> 수동 빈 등록이 우선권 가짐
     */
}
