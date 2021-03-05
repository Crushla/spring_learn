package com.hwd;

import com.hwd.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredbeans.xml");
        People people = (People) context.getBean("people");
        people.getDog().shout();
        people.getCat().shout();
    }
}
