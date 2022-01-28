package org.example;

import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.example.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01() {
        String config = "app01.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("容器中对象名称：" + name);
            System.out.println(ac.getBean(name));
        }
    }
    @Test
    public void testDaoInsert(){
        String config="app01.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentDao dao  = (StudentDao) ac.getBean("studentDao");
        System.out.println(dao.getClass().getDeclaredMethods());
        Student student  = new Student();
        student.setId(1013);
        student.setName("周锋");
        student.setEmail("zhoufeng@qq.com");
        student.setAge(20);
        int studentCount = dao.insertStudent(student);
        List<Student> students = dao.findAllStudents();
        students.stream().forEach(System.out::println);
        System.out.println("插入成功的学生数目" + studentCount);
    }
    @Test
    public void testService() {
        String config = "app01.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService myService = (StudentService) ac.getBean("myService");
        Student student = new Student();
        student.setId(1018);
        student.setName("胡八一");
        student.setEmail("111@gmail.com");
        student.setAge(22);
        int studentCount = myService.addStudent(student);
        System.out.println("插入成功" + studentCount + "条");
    }
}
