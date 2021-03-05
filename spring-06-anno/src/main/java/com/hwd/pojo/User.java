package com.hwd.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.hwd.pojo.User"/>
//@Component组件
@Component
public class User {
    //相当于<property name="name" value="胡炜东"/>
    @Value("胡炜东")
    public String name;
}
