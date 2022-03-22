package com.example.maker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int account;
    private String userName;
    private String password;
    private boolean sex;
    private int grade;
    private String major;
    private String birthday;
    private int age;
    private String tel;
}
