package org.example.service;

import org.example.dao.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//业务处理层
@Service
public class LoginService {

    @Autowired
    private LoginDAO loginDAO;
}
