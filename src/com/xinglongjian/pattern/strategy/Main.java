package com.xinglongjian.pattern.strategy;

public class Main
{
    public static void main(String[] args)
    {
        ConcreteStrategyA a=new ConcreteStrategyA();
        Context cxt=new Context(a);//使用a策略
        cxt.ContextInterface();
        
        ConcreteStrategyB b=new ConcreteStrategyB();
        cxt=new Context(b);
        cxt.ContextInterface();
        
        System.out.println("下面使用简单工厂方法");
        //========通过简单工厂类调用==========================
        ContextFactory cf=new ContextFactory();
        cf.ContextInterface('A');
        cf.ContextInterface('B');
        cf.ContextInterface('C');
    }
   

}
