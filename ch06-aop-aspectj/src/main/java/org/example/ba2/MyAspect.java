package org.example.ba2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
    @AfterReturning(value = "execution(* *..SomeServiceImpl.*(..))",returning = "res")
    public void myAfterReturning(JoinPoint jp,Object res) {
        System.out.println("后置通知：方法的定义" + jp.getSignature());
        System.out.println("后置通知：在目标方法之后执行的，获取的返回值是：" + res);
        if (res != null) {
            res = "hello aspectj";
        }
    }
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
    public void afterDoOther(JoinPoint jp,Object res) {
        System.out.println(jp.getSignature());
        System.out.println("返回值是" + res);
        if (res instanceof Student) {
            ((Student) res).setAge(66);
            System.out.println(((Student) res).getAge());
        }
    }
}
