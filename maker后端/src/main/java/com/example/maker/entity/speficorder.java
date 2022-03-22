package com.example.maker.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class speficorder {
    private int orderNumber;
    private int dishID;
    private int disNum;
}
