package org.example.controller;

import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
//前端业务交互层
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

}
