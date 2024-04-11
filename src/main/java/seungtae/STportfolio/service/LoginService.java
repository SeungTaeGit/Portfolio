package seungtae.STportfolio.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import seungtae.STportfolio.domain.Manager;
import seungtae.STportfolio.repository.MemberRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    // 추후 개발 진행
    public Manager login(String Id, String pw) {
        return memberRepository.findById(Id)
                .filter(m -> m.getPassword().equals(pw))
                .orElse(null);
    }
}
