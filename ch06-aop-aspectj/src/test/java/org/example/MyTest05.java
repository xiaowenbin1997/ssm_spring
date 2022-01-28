package org.example;

import org.example.ba5.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {
    @Test
    public void myTest05() {
        String config = "app05.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService serviceImpl = (SomeService) ac.getBean("someServiceImpl");
        serviceImpl.doThird();
    }
}
