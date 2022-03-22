package com.example.maker.repository;

import com.example.maker.entity.User;
import com.example.maker.entity.Waiter;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
@Mapper
public interface WaiterRepository {
    List<Waiter> findAll();
    Waiter getByID(int id);
    Object deleteByID(int id);
    Object insertByID(int id, String password);
    Object updatePasswordByID(int id, String password);
    Object getTodolist();
    Object removeTodolist(int id);
    Object updateDishByID(int dishID, String dishName, String dishIMG, String dishDis, int dishNum, float dishMon);
    Object deleteDishByID(int dishID);
    Object addDishByID(int dishID, String dishName, String dishIMG, String dishDis, int dishNum, float dishMon);
    Object addLocation(int UserID, String loca);
    Object findSpeficorder(int orderNumber);
}
