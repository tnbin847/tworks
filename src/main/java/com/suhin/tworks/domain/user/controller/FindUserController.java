package com.suhin.tworks.domain.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FindUserController {

    @GetMapping("/find")
    public ModelAndView find() {
        return new ModelAndView("pages/user/find");
    }
}