package com.hwd.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Value("hwd")
    public void setName(String name) {
        this.name = name;
    }
}
