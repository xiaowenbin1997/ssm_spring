package org.example.ba1;

public class SomeServiceImpl implements SomeService{
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("===这是接口实现类中的doSome方法===");
    }
}
