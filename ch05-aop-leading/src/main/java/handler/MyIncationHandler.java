package handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIncationHandler implements InvocationHandler {
    private Object target;

    public MyIncationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这是invoke方法");
        System.out.println("method的方法名是" + method.getName());
        Object result = null;
        result = method.invoke(target,args);
        return result;
    }
}
