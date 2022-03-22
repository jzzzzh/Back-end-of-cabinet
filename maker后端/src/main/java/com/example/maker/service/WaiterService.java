package com.example.maker.service;

import com.example.maker.repository.WaiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaiterService {
    @Autowired
    private WaiterRepository waiterRepository;

    public Object findAll()
    {
        return waiterRepository.findAll();
    }

    public Object getByID(int ID)
    {
        return waiterRepository.getByID(ID);
    }
    public Object updatePasswordByID(int id, String password)
    {
        return waiterRepository.updatePasswordByID(id,password);
    }
    public Object deleteByID(int id)
    {
        return waiterRepository.deleteByID(id);
    }
    public Object insertByID(int id, String password)
    {
        return waiterRepository.insertByID(id, password);
    }
    public Object getTodolist()
    {
        return waiterRepository.getTodolist();
    }
    public Object removeTodolist(int UserID)
    {
        waiterRepository.removeTodolist(UserID);
        return true;
    }
    public Object updateDishByID(int dishID, String dishName, String dishIMG, String dishDis, int dishNum, float dishMon){
        waiterRepository.updateDishByID(dishID,dishName,dishIMG,dishDis,dishNum,dishMon);
        return true;
    }
    public Object deleteDishByID(int dishID){
        waiterRepository.deleteDishByID(dishID);
        return true;
    }
    public Object addDishByID(int dishID, String dishName, String dishIMG, String dishDis, int dishNum, float dishMon){
        waiterRepository.addDishByID(dishID,dishName,dishIMG,dishDis,dishNum,dishMon);
        return true;
    }
    public Object addLocation(int UserID, String loca)
    {
        waiterRepository.addLocation(UserID,loca);
        return true;
    }
    public Object findSpeficorder(int orderNumber){
        return waiterRepository.findSpeficorder(orderNumber);
    }
}
