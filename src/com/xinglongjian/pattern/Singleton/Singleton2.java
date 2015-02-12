package com.xinglongjian.pattern.Singleton;


/**
 * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步
 * @author zwl
 *
 */
public class Singleton2
{
    //私有化构造函数，防止其他人创建实例
    private Singleton2()    {        
    }
    
    private static Singleton2 singleton;
    
    public static synchronized Singleton2 getInstance()
    {
        if(singleton==null)
            singleton=new Singleton2();
        return singleton;
    }
}
