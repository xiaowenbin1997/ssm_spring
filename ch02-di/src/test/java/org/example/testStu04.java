package org.example;

import org.example.ba4.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStu04 {
    @Test
    public void test04() {
        String config = "ba4/app04.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStu = (Student) ac.getBean("myStu");
        System.out.println(myStu);
    }
}
