package com.xinglongjian.pattern.proxy;

/**
 * 代理模式是常用的java设计模式，它的特征是代理类和委托类有同样的接口。
 * 代理类主要负责为委托类预处理消息、过滤消息、把消息转发给委托类，以及事后处理消息等。
 * 
 * 代理类本身不是真正实现服务，而是通过调用委托类的对象的相关方法。
 * 
 * 分两种：静态代理类和动态代理类(运行时创建，由反射机制动态创建)
 * @author zwl
 *
 */
public class ProxyTest
{
    public static void main(String[] args)
    {
        //static proxy
        HelloService helloService=new HelloServiceImpl();
        HelloService proxy=new HelloServiceProxy(helloService);
        proxy.printHello("hello world!");
        
        //通过动态代理调用
        HelloService dynamicProxy=HelloServiceProxyFactory.getHelloServiceProxy(helloService);
        dynamicProxy.printHello("i am dynamic proxy");
    }

}
