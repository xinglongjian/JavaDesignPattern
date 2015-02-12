package com.xinglongjian.pattern.simplefactory.operation;

/**
 * 操作符抽象类
 * @author zwl
 *
 */
public abstract class Operation
{
    private double numberA;
    private double numberB;
    public double getNumberA()
    {
        return numberA;
    }
    public void setNumberA(double numberA)
    {
        this.numberA = numberA;
    }
    public double getNumberB()
    {
        return numberB;
    }
    public void setNumberB(double numberB)
    {
        this.numberB = numberB;
    }
    
    public abstract double getResult();

}
