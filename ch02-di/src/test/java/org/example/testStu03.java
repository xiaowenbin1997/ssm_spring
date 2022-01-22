package org.example;

import org.example.ba3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStu03 {
    @Test
    public void testStu03() {
        String config = "ba3/app3.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStu01 = (Student) ac.getBean("myStu01");
        System.out.println(myStu01);
        System.out.println("=============");
        Student myStu02 = (Student) ac.getBean("myStu02");
        System.out.println(myStu02);
    }
}
