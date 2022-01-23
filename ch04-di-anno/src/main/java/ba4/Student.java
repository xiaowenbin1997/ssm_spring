package ba4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("献忠大人")
    private String name;
    private int age;
    @Autowired
    @Qualifier(value = "mySchool")
    private School school;

    public Student() {
        System.out.println("student的无参构造");
    }

    public void setName(String name) {
        this.name = name;
    }
    @Value("33")
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
