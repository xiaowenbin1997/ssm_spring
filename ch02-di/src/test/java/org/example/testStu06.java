package org.example;

import org.example.ba6.School;
import org.example.ba6.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStu06 {
    @Test
    public void test06() {
        String config = "ba6/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStu = (Student) ac.getBean("myStu");
        System.out.println(myStu);
    }
}
