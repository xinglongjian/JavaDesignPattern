package com.xinglongjian.pattern.strategy;

/**
 * 环境对象，封装对策略的使用的引用
 * @author zwl
 *
 */
public class Context
{
    Strategy strategy;
    
    //这个需要在构造函数中传入策略的实例对象，可以将简单工厂模式结合起来
    public Context(Strategy strategy)
    {
        this.strategy=strategy;
    }

    /**
     * 统一调用接口
     */
    public void ContextInterface()
    {
        strategy.algorithmInterface();
    }
}
