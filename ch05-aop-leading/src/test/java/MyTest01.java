import handler.MyIncationHandler;
import org.junit.Test;
import service.SomeService;
import service.impl.SomeServiceImpl01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyTest01 {
    @Test
    public void test01() {
        SomeService target = new SomeServiceImpl01();
        InvocationHandler handler = new MyIncationHandler(target);
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                handler);
        System.out.println("proxy name===" + proxy.getClass().getName());
        System.out.println("proxy fields===" + proxy.getClass().getFields());
        proxy.doSome();
        System.out.println("=============");
        proxy.doOther();
    }
}
