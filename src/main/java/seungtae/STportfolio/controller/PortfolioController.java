package seungtae.STportfolio.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/portfolio")
@Slf4j
public class PortfolioController {

    @GetMapping("/portfolio")
    public String portfolio() {
        return "portfolio/portfolio";
    }

    @GetMapping("/checkmate")
    public String contact() {
        return "portfolio/checkmate";
    }

    @GetMapping("/basic")
    public String hideManage() {
        return "portfolio/basicCRUD";
    }
}
