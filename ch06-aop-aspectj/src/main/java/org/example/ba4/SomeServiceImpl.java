package org.example.ba4;

import org.example.ba3.Student;

public class SomeServiceImpl implements SomeService{
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("doSome");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("doOther");
        return "doOther";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("doFirst");
        return "doFirst";
    }

    @Override
    public void doSecond() {
        System.out.println("doSecond()" + (10 / 0));
    }
}
