package com.xinglongjian.pattern.proxy;

/**
 * service implement
 * @author zwl
 *
 */
public class HelloServiceImpl implements HelloService
{

    @Override
    public void printHello(String msg)
    {
        // TODO Auto-generated method stub
        System.out.println(msg);

    }

}
