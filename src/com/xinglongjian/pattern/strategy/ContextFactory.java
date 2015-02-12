package com.xinglongjian.pattern.strategy;

/**
 * 将策略模式和简单工厂模式结合起来
 * @author zwl
 *
 */
public class ContextFactory
{
    /**
     * 假如类型：A：打折，B:满减,C:满积分
     * @param type
     * @return
     */
    public Strategy createStrategy(char type)
    {
        Strategy strategy=null;
        switch (type)
        {
            case 'A':
                strategy=new ConcreteStrategyA();
                break;
            case 'B':
                strategy=new ConcreteStrategyB();
                break;
            case 'C':
                strategy=new ConcreteStrategyC();
                break;
            default:
                break;
        }
        return strategy;
    }
    
    /**
     * 统一调用接口
     * @param type
     */
    public void ContextInterface(char type)
    {
        Strategy str=createStrategy(type);//通过简单工厂方法获取策略类
        str.algorithmInterface();
    }

}
