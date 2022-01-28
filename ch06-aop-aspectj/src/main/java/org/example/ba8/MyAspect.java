package org.example.ba8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Before(value = "cut()")
    public void myBefore() {
        System.out.println("前置方法");
    }
    @After(value = "cut()")
    public void myAfter() {
        System.out.println("后置方法");
    }
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void cut(){}
}
