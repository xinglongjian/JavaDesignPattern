package com.xinglongjian.pattern.Singleton;

/**
 * 该写法无法在多线程下工作
 * @author zwl
 *
 */
public class Singleton1
{
    //私有化构造函数，防止其他人创建实例
    private Singleton1()
    {
        
    }
    
    private static Singleton1 singleton;
    
    public static Singleton1 getInstance()
    {
        if(singleton==null)
            singleton=new Singleton1();
        return singleton;
    }

}
