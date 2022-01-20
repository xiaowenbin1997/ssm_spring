package org.example.impl;

import org.example.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl的无参构造");
    }

    @Override
    public void doSome() {
        System.out.println("doSome执行");
    }
}
