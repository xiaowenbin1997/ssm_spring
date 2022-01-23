package ba6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Student {
    @Value("图图")
    private String name;
    private int age;
    @Resource(name = "mySchool01")
    private School school;

    public Student() {
        System.out.println("student的无参构造");
    }

    public void setName(String name) {
        this.name = name;
    }
    @Value("8")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
