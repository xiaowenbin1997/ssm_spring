package org.example;

import org.example.ba5.School;
import org.example.ba5.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStu05 {
    @Test
    public void testStu05() {
        String config = "ba5/app05.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStu05");
        System.out.println(student);
    }
}
