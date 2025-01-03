package hello.hello_spring;

//자바 코드로 직접 스프링 빈 등록
import hello.hello_spring.repository.*;

import hello.hello_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final DataSource dataSource;
    private final EntityManager em;

    public SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

//    private final MemberRepository memberRepository;

//    public SpringConfig(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
        //return new MemberService(memberRepository);
    }

    @Bean
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
}
