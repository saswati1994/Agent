package com.test.AgentRegistration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginForm(){
     return "login";
 }

 @RequestMapping(value = "/loggin", method = RequestMethod.POST)
    public String doLogin(){
        return "success-reg";
 }

}

