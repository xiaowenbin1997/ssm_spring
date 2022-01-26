package org.example;

import org.example.ba3.SomeService;
import org.example.ba3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void test03() {
        String config = "app03.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService serviceImpl = (SomeService) ac.getBean("someServiceImpl");
        Student student = serviceImpl.doOther2("王五", 33);
        System.out.println("student信息是" + student);
        String s = serviceImpl.doFirst("ji", 33);
        System.out.println("检验：s = " + s);
    }
}
