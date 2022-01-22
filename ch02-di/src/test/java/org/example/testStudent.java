package org.example;

import org.example.ba1.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStudent {
    @Test
    public void test01() {
        String config = "ba1/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student)ac.getBean("myStudent");
        System.out.println("student对象是" + student);
    }
}
