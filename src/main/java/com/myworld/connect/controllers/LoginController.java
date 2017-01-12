package com.myworld.connect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/logIn", method = RequestMethod.GET)
    public ModelAndView getLogInPage() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/logIn", method = RequestMethod.POST)
    public String verifyLogIn(@RequestParam String userId, @RequestParam String password) {
        return null;
    }
}
