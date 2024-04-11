package seungtae.STportfolio;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import seungtae.STportfolio.domain.Manager;
import seungtae.STportfolio.repository.MemberRepository;

@Component
@RequiredArgsConstructor
public class ManagerData {

    private final MemberRepository memberRepository;

    @PostConstruct
    public void init() {
        Manager manager = new Manager();
        manager.setId("SeungTae");
        manager.setPassword("pw");
        memberRepository.save(manager);
    }
}
