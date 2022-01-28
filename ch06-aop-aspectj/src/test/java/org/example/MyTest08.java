package org.example;

import org.example.ba8.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest08 {
    @Test
    public void test08() {
        String config = "app08.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeServiceImpl serviceImpl = (SomeServiceImpl) ac.getBean("someServiceImpl");
        System.out.println("proxy=" + serviceImpl.getClass().getName());
        serviceImpl.doThird();
    }
}
