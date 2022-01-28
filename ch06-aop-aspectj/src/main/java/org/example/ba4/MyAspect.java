package org.example.ba4;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",throwing = "err")
    public void myAfterThrowing(Exception err) {
        System.out.println("异常" + err.getMessage());
    }
}
