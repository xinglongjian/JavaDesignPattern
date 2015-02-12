package com.xinglongjian.pattern.Singleton;


public class Singleton23
{

    private Singleton23()
    {
        
    }
    private static Object synOjb=new Object();
    
    private static Singleton23 instance;
    
    /**
     * 支持多线程，这样就只有为null时，才调用加锁并创建实例
     * @return
     */
    public static Singleton23 getInstance()
    {
        if(instance==null)
        {
            synchronized (synOjb)
            {
               instance=new Singleton23();
            }
        }
        
        return instance;
    }
}
