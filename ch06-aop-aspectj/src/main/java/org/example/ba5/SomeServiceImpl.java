package org.example.ba5;

public class SomeServiceImpl implements SomeService{
    @Override
    public void doThird() {
        System.out.println("执行doThird()" + (10 / 0));
    }
}
