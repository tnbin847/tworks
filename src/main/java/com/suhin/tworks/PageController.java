package com.suhin.tworks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "pages/index";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "pages/user/signup";
    }

    @GetMapping("/account/find")
    public String findAccount() {
        return "pages/user/find_account";
    }
}