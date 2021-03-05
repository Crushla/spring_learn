package com.hwd.demo2;

public class UserServiceProxy implements UserService {
    public void setUserServiceImp(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    private UserServiceImp userServiceImp;

    public void add() {
        log("add");
        userServiceImp.add();

    }

    public void delete() {
        log("delete");
        userServiceImp.delete();
    }

    public void update() {
        log("update");
        userServiceImp.update();
    }

    public void query() {
        log("query");
        userServiceImp.query();
    }
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
