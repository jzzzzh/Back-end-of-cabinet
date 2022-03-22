package com.example.maker.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dish {
    private int dishID;
    private String dishName;
    private String dishIMG;
    private String dishDes;
    private int dishNum;
    private float dishMon;
}
