package org.example;


import org.example.ba4.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {
    @Test
    public void myTest04() {
        String config = "app04.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService serviceImpl = (SomeService) ac.getBean("someServiceImpl");
        serviceImpl.doSecond();
    }
}
