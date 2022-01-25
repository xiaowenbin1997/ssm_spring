package org.example;

import org.example.ba1.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void test01() {
        String config = "app01.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someServiceImpl = (SomeService) ac.getBean("someServiceImpl");
        someServiceImpl.doSome("王五",20);
    }
}
