package com.xinglongjian.pattern.Singleton;

/**
 *  这个是第二种方式的升级版，俗称双重检查锁定，详细介绍请查
 * @author zwl
 *
 */
public class Singleton7
{
    private volatile static Singleton7 singleton;  
    private Singleton7 (){}  
    public static Singleton7 getSingleton() {  
    if (singleton == null) {  
        synchronized (Singleton7.class) {  
        if (singleton == null) {  
            singleton = new Singleton7();  
        }  
        }  
    }  
    return singleton;  
    }  
}
