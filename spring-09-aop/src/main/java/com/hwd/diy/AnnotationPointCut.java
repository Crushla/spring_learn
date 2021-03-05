package com.hwd.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解实现aop
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.hwd.service.UserServiceImpl.*())")
    public void before() {
        System.out.println("方法执行前");
    }

    public void after() {

    }
}
