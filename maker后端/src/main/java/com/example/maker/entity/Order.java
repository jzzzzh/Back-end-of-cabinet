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
public class Order {
    private int orderNumber;
    private int account;
    private String orderTime;
    private float money;
    private boolean isFinished;
}
