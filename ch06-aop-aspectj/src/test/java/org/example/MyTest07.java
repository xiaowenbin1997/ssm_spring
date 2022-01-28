package org.example;

import org.example.ba7.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public void myTest07() {
        String config = "app07.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeServiceImpl serviceImpl = (SomeServiceImpl) ac.getBean("someServiceImpl");
        System.out.println(serviceImpl.getClass().getName());
        serviceImpl.doThird();
    }
}
