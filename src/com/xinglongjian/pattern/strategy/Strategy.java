package com.xinglongjian.pattern.strategy;

/**
 * 定义支持所有算法的公共接口
 * @author zwl
 *
 */
public abstract class Strategy
{
    //不同的实现类实现不同的算法，也就是不同的策略
   public abstract void algorithmInterface();
   
}
