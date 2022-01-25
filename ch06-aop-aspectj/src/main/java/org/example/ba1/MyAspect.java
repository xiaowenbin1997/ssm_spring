package org.example.ba1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
    @Before(value = "execution(public void org.example.ba1.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore() {
        System.out.println("前置通知,切面功能：在目标方法之前输出执行时间：" + new Date());
    }

}
