package proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class GamePlayerIH implements InvocationHandler {

    /**
     * 被代理者
     */
    Class cls = null;

    /**
     * 被代理实例
     */
    Object obj = null;

    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    /**
     * 调用被代理的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxyStart");
        Object result = method.invoke(this.obj, args);
        System.out.println("proxyEnd");
        return result;
    }
}
