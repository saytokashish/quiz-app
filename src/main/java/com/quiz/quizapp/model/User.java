package com.quiz.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Table(name="user_details")
@Entity
@Data
public class User {
    private String firstName;
    private String lastName;
    private String email;
    @Id
    private String userName;
    private String password;
}
