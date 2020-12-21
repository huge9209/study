package com.edu.proxy.jingtai;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-12-21 10:00
 */
public class UserServiceProxy implements  UserServce{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void delete() {
        userService.delete();
    }

    public void add() {
        userService.add();
    }

    public void update() {
        userService.update();
    }

    public void query() {
        userService.query();
    }

    public void log(String name){
        System.out.println(name);
    }
}
