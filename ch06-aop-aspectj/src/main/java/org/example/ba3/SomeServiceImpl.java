package org.example.ba3;

public class SomeServiceImpl implements SomeService{
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("==目标方法doSome==");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("==目标方法doOther==");
        return "abc";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        System.out.println("==doOther2==");
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("==doFirst==");
        return "doFirst";
    }
}
