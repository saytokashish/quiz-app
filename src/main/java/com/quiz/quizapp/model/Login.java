package com.quiz.quizapp.model;

import lombok.Data;

@Data
public class Login {
    private String userName;
    private String password;
    public Login(String userName, String password){
        this.userName=userName;
        this.password=password;
    }
}
