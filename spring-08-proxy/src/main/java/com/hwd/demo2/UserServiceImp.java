package com.hwd.demo2;

//真实对象
public class UserServiceImp implements UserService {
    public void add() {

        System.out.println("增加了一个用户");
    }

    public void delete() {

        System.out.println("删除了一个用户");
    }

    public void update() {

        System.out.println("修改了一个用户");
    }

    public void query() {

        System.out.println("查找了一个用户");
    }
}
