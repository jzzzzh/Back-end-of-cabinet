package com.example.maker.controller;

import com.example.maker.entity.Waiter;
import com.example.maker.service.WaiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.security.pkcs11.P11Util;

import java.util.Map;

@RestController
@RequestMapping("/waiter")
public class WaiterController {
    @Autowired
    WaiterService waiterService;


    @RequestMapping("/findAll")
    public Object findAll(){
        return waiterService.findAll();
    }

    @RequestMapping("/getByID")
    public Object getByID(@RequestParam(name = "ID", required = true) int id){
        return waiterService.getByID(id);
    }
    @RequestMapping("/updatePasswordByID")
    public Object updatePasswordByID(@RequestParam(name = "ID", required = true) int id, @RequestParam(name = "password", required = true) String password)
    {
        waiterService.updatePasswordByID(id,password);
        return true;
    }
    @RequestMapping("/deleteByID")
    public Object deleteByID(@RequestParam(name = "ID", required = true) int id)
    {
        Object obj = waiterService.getByID(id);
        waiterService.deleteByID(id);
        return obj;
    }
    @RequestMapping("/insertByID")
    public Object insertByID(@RequestParam(name = "ID", required = true) int id, @RequestParam(name = "password", required = true) String password)
    {
        waiterService.insertByID(id,password);
        return waiterService.getByID(id);
    }
    //获取todolist
    @RequestMapping("/getTodolist")
    public Object getTodolist()
    {
        return waiterService.getTodolist();
    }
    //完成配餐
    @RequestMapping("/removeTodolist")
    public Object removeTodolist(@RequestParam(name ="ID", required = true) int UserID)
    {
        return waiterService.removeTodolist(UserID);
    }
    //修改菜单
    @RequestMapping("/updateDishByID")
    public Object updateDishByID(@RequestParam(name ="dishID", required = true)int dishID, @RequestParam(name ="dishName", required = true)String dishName, @RequestParam(name ="dishIMG", required = true)String dishIMG, @RequestParam(name ="dishDis", required = true)String dishDis, @RequestParam(name ="dishNum", required = true)int dishNum, @RequestParam(name ="dishMon", required = true)float dishMon)
    {
        return waiterService.updateDishByID(dishID,dishName,dishIMG,dishDis,dishNum,dishMon);
    }

    //删除菜单
    @RequestMapping("/deleteDishByID")
    public Object deleteDishByID(@RequestParam(name ="dishID", required = true)int dishID)
    {
        return waiterService.deleteDishByID(dishID);
    }
    //增加菜单
    @RequestMapping ("/addDishByID")
    public Object addDishByID(@RequestParam(name ="dishID", required = true)int dishID, @RequestParam(name ="dishName", required = true)String dishName, @RequestParam(name ="dishIMG", required = true)String dishIMG, @RequestParam(name ="dishDis", required = true)String dishDis, @RequestParam(name ="dishNum", required = true)int dishNum, @RequestParam(name ="dishMon", required = true)float dishMon)
    {
        return waiterService.addDishByID(dishID,dishName,dishIMG,dishDis,dishNum,dishMon);
    }

    //提交地点
    @RequestMapping ("/addLocation")
    public Object addLocation(@RequestParam(name ="UserID", required = true)int UserID, @RequestParam(name ="loca", required = true)String loca)
    {
        return waiterService.addLocation(UserID,loca);
    }
    //查询具体订单
    @RequestMapping("/findSpeficorder")
    public Object findSpeficorder(@RequestParam(name ="orderNumber", required = true)int orderNumber)
    {
        return waiterService.findSpeficorder(orderNumber);
    }
}
