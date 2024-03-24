package com.quiz.quizapp.controller;

import com.quiz.quizapp.model.Login;
import com.quiz.quizapp.model.User;
import com.quiz.quizapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody Login loginDetails){
        return accountService.login(loginDetails);
    }
    @PostMapping("signup")
    public ResponseEntity<String> signup(@RequestBody User userDetails){
        return accountService.signup(userDetails);
    }
}
