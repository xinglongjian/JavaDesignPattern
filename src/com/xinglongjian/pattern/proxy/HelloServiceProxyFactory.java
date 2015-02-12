package com.xinglongjian.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建动态代理类
 * @author zwl
 *
 */
public class HelloServiceProxyFactory
{
    /**
     * Create a dynamic proxy class instance ，that is the realization of the HelloService interface 
     * @param helloService
     * @return
     */
    public static HelloService getHelloServiceProxy(final HelloService helloService)
    {
        InvocationHandler handler=new InvocationHandler()
        {
            
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
            {
                // TODO Auto-generated method stub
                System.out.println("before calling "+method);//预处理
                Object result=method.invoke(helloService, args);
                System.out.println("after calling "+method);//事后处理
                return result;
            }
        };
        
        Class classType=HelloService.class;
        return (HelloService) Proxy.newProxyInstance(classType.getClassLoader(), new Class[]{classType}, handler);
        
    }
}
