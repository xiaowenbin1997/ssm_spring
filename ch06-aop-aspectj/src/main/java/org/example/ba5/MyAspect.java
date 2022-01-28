package org.example.ba5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    @After(value = "execution(* *..SomeServiceImpl.*(..))")
    public void myAfterMethod() {
        System.out.println("虽然有错，但是也会执行");
    }
}
