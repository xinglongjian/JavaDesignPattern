package com.xinglongjian.pattern.Singleton;

import java.util.concurrent.locks.Lock;

public class Singleton22
{

    private Singleton22()
    {
        
    }
    private static Object synOjb=new Object();
    
    private static Singleton22 instance;
    
    /**
     * 支持多线程，但不足是，不管实例是否创建了，都需要加锁
     * @return
     */
    public static Singleton22 getInstance()
    {
        synchronized (synOjb)
        {
            if(instance==null)
                instance=new Singleton22();
        }
        return instance;
    }
}
