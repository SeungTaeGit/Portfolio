package seungtae.STportfolio.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@Slf4j
public class BasicController {

    @GetMapping("portfolio")
    public String portfolio() {
        return "page/portfolio";
    }

    @GetMapping("contact")
    public String contact() {
        return "page/contact";
    }

    @GetMapping("manage")
    public String hideManage() {
        return "page/management";
    }
}
