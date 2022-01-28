package org.example.ba7;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Before(value = "cut()")
    public void myBefore() {
        System.out.println("前置通知");
    }
    @After(value = "cut()")
    public void myAfter() {
        System.out.println("后置通知");
    }

    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void cut(){
    }
}
