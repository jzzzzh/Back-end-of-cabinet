package com.example.maker.service;

import com.example.maker.entity.Dish;
import com.example.maker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Object findAll(){
        return userRepository.findAll();
    }

    public Object getByID(int account)
    {
        return userRepository.getByID(account);
    }

    public Object updatePasswordByID(int account, String password)
    {
        return userRepository.updatePasswordByID(account,password);
    }

    public Object deleteByID(int account)
    {
        return userRepository.deleteByID(account);
    }

    public Object insertByID(int account, String userName, String password, boolean sex, int grade, String major, String birthday, int age, String tel)
    {
        return userRepository.insertByID(account,userName,password,sex,grade,major,birthday,age,tel);
    }
    public List<Dish> getDishes()
    {
        return userRepository.getDishes();
    }
    public Object setOrders(int orderNumber, int account, String orderTime, float money, boolean isFinished)
    {
        return userRepository.setOrders(orderNumber,account,orderTime, money, isFinished);
    }
    public Object setspeficOrder(int orderNumber, int dishID,int dishNum)
    {
        return userRepository.setspeficOrder(orderNumber,dishID,dishNum);
    }
    public Object setTodolist(int userID, String date)
    {
        return userRepository.setTodolist(userID,date);
    }
    public Object getLocation(int userID)
    {
        return userRepository.getLocation(userID);
    }
    public Object removeLocation(int userID)
    {
        return userRepository.removeLocation(userID);
    }
    //点单成功，菜品数目--；
}
