package org.example;

import org.example.ba2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStu02 {
    @Test
    public void testStu02() {
        String config = "ba2/app2.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStu = (Student) ac.getBean("myStu");
        System.out.println(myStu);
    }
}
