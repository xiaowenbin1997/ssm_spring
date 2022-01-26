package org.example.ba3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    @Around(value = "execution(* *..SomeServiceImpl.*(..))")
    public Object firstAround(ProceedingJoinPoint pjp) throws Throwable {
        String name = "";
        Integer age = 0;
        Object[] args = pjp.getArgs();
        if (args != null && args.length > 1) {
            Object temp = args[0];
            name = (String) temp;
            Object temp1 = args[1];
            age = (Integer) temp1;
        }
        Object result = null;
        System.out.println("环绕通知：在目标方法之前，输出时间：" + new Date());
        if (33 == age) {
            result = pjp.proceed();
        }
        System.out.println("环绕通知：在目标方法之后，提交事务");
        if (result != null) {
            if (result instanceof Student) {
                result = new Student("李四", 88);
            } else {
                result = "wo xian run le";
            }
        }
        return result;
    }
}
