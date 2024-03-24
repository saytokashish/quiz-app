package com.quiz.quizapp.service;
import com.quiz.quizapp.model.User;
import com.quiz.quizapp.dao.AccountDao;
import com.quiz.quizapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    AccountDao accountDao;
    public ResponseEntity<String> signup(User userDetails) {
        accountDao.save(userDetails);
        return new ResponseEntity<>("Account Created",HttpStatus.CREATED);
    }

    public ResponseEntity<String> login(Login loginDetails) {
        Optional<User> u = accountDao.findById(loginDetails.getUserName());
        if(u.equals(null) || loginDetails.getPassword().equals(u.get().getPassword()))
            return new ResponseEntity<>("user doesn't exist or wrong password",HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>("logged in",HttpStatus.OK);
    }
}
