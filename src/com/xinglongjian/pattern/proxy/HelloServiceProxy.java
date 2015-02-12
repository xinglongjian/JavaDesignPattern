package com.xinglongjian.pattern.proxy;

/**
 * the Class of Service Proxy
 * @author zwl
 *
 */
public class HelloServiceProxy implements HelloService
{
    //include a service impl
    private HelloService helloService;
    
    public HelloServiceProxy(HelloService service)
    {
        this.helloService=service;
    }

    @Override
    public void printHello(String msg)
    {
        // TODO Auto-generated method stub
        
        //before invoke
        System.out.println("调用hello服务前");
        helloService.printHello(msg);
        System.out.println("调用hello服务后");
    }
   
}
