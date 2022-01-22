package org.example.ba1;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("无参数构造方法创建对象");
    }

    public void setEmail(String email) {
        System.out.println("setEmail + " + email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set方法注入依赖setName + " + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge + " + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
