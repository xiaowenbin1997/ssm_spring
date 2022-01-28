package org.example;

import org.example.ba6.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest06 {
    @Test
    public void test06() {
        String config = "app06.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService serviceImpl = (SomeService) ac.getBean("someServiceImpl");
        serviceImpl.doThird();
    }
}
