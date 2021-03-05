package com.hwd.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceImp userServiceImp=new UserServiceImp();

        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setUserServiceImp(userServiceImp);
    }
}
