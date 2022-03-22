package com.example.maker.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
//扫码取餐
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todolist {
    private int userID;
    private String date;
}
