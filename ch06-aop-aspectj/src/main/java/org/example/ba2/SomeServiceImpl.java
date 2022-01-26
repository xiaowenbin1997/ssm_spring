package org.example.ba2;

public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, Integer age) {
        System.out.println("===这是接口实现类中的doSome方法===");
        return "来了来了";
    }

    @Override
    public Student doOther(String name, Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return student;
    }

}
