package seungtae.STportfolio.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import seungtae.STportfolio.domain.Manager;
import seungtae.STportfolio.service.LoginService;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
@Slf4j
public class LoginController {

    private final LoginService loginService;

    @GetMapping
    public String hideLogin(@ModelAttribute("manager")Manager manager) {
        return "page/login";
    }

    @PostMapping
    public String Login(@ModelAttribute("manager") Manager manager) {

        Manager loginUser = loginService.login(manager.getId(), manager.getPassword());

        if (loginUser == null) {
            log.info("Login FAIL");
            return "redirect:/";
        }

        log.info("Login SUCCESS");
        return "redirect:/manage";
    }
}
