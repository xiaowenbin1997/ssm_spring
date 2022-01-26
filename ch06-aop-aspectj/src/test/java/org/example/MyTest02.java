package org.example;

import org.example.ba2.SomeService;
import org.example.ba2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test02() {
        String config = "app02.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        SomeService serviceImpl = (SomeService) ac.getBean("someServiceImpl");
//        String res = serviceImpl.doSome("献忠", 39);
//        System.out.println(res);
        SomeService serviceImpl = (SomeService) ac.getBean("someServiceImpl");
        Student student = serviceImpl.doOther("王五", 99);
        System.out.println(student);
    }
}
