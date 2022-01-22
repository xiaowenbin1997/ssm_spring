import ba2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test02() {
        String config = "app02.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("student");
        Student student02 = (Student) ac.getBean("student");
        System.out.println(student + student.toString01());
        System.out.println(student02 + student.toString01());
    }
}
