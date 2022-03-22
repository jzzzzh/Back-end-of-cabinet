package com.example.maker.repository;

import com.example.maker.entity.Dish;
import com.example.maker.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserRepository {
    List<User> findAll();
    User getByID(int account);
    Object deleteByID(int account);
    Object insertByID(int account, String userName, String password, boolean sex, int grade, String major, String birthday, int age, String tel);
    Object updatePasswordByID(int account, String password);
    List<Dish> getDishes();
    Object setOrders(int orderNumber, int account, String orderTime, float money, boolean isFinished);
    Object setspeficOrder(int orderNumber, int dishID,int dishNum);
    Object setTodolist(int userID, String date);
    Object getLocation(int userID);
    Object removeLocation(int userID);
}
