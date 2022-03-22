package com.example.maker.controller;

import com.example.maker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
@CrossOrigin(origins = "http://127.0.0.1:8080",maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //显示所有user
    @RequestMapping("/findAll")
    public Object findAll()
    {
        return userService.findAll();
    }
    //通过ID查User
    @RequestMapping("/getByID")
    public Object getByID(@RequestParam(name = "ID", required = true) int id){
        return userService.getByID(id);
    }
    //更新用户密码
    @RequestMapping("/updatePasswordByID")
    public Object updatePasswordByID(@RequestParam(name = "ID", required = true) int id, @RequestParam(name = "password", required = true) String password)
    {
        userService.updatePasswordByID(id,password);
        return true;
    }
    //用户注销
    @RequestMapping("/deleteByID")
    public Object deleteByID(@RequestParam(name = "ID", required = true) int id)
    {
        Object obj = userService.getByID(id);
        userService.deleteByID(id);
        return obj;
    }
    //用户注册
    @RequestMapping("/insertByID")
    public Object insertByID(@RequestParam(name = "ID", required = true) int id, @RequestParam(name = "userName", required = true) String userName, @RequestParam(name = "password", required = true) String password, @RequestParam(name = "sex", required = true)boolean sex,@RequestParam(name = "grade", required = true) int grade, @RequestParam(name = "major", required = true)String major, @RequestParam(name = "birthday", required = true)String birthday, @RequestParam(name = "age", required = true)int age, @RequestParam(name = "tel", required = true)String tel)
    {
        userService.insertByID(id,userName,password,sex,grade,major,birthday,age,tel);
        return userService.getByID(id);
    }
    //用户获取菜单（点餐界面）
    @RequestMapping("/getDishes")
    public Object getDishes()
    {
        return userService.getDishes();
    }
    //用户下单（第一步）
    @RequestMapping("/setOrders")
    public Object setOrders(@RequestParam(name = "orderNumber", required = true)int orderNumber, @RequestParam(name = "ID", required = true)int account, @RequestParam(name = "orderTime", required = true)String orderTime,@RequestParam(name = "money", required = true) float money, @RequestParam(name = "isFinished", required = true)boolean isFinished)
    {
        userService.setOrders(orderNumber,account,orderTime, money, isFinished);
        return true;
    }
    //用户下单（第二步，上传具体订单）
    @RequestMapping("setspeficOrder")
    public Object setspeficOrder(@RequestParam(name = "ID", required = true)int orderNumber, @RequestParam(name = "dishID", required = true)int dishID,@RequestParam(name = "dishNum", required = true)int dishNum)
    {
        userService.setspeficOrder(orderNumber,dishID,dishNum);
        return true;
    }
    //用户到达
    @RequestMapping("/setTodolist")
    public Object setTodolist(@RequestParam(name = "ID", required = true)int userID)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间
        userService.setTodolist(userID,date);
        return true;
    }
    //用户获取localtion
    @RequestMapping("/getLocation")
    public Object getLocation(@RequestParam(name = "ID", required = true)int userID)
    {
        return userService.getLocation(userID);
    }
    //用户完成取餐
    @RequestMapping("/removeLocation")
    public Object removeLocation(@RequestParam(name = "ID", required = true)int userID)
    {
        return userService.removeLocation(userID);
    }
}
