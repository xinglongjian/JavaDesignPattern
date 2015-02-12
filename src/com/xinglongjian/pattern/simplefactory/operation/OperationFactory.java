package com.xinglongjian.pattern.simplefactory.operation;

/**
 * 简单工厂方法,该种方式违背了“开放封闭原则”，即“系统对扩展开放，对修改封闭”的原则。
 * 如果再增加一种操作类型，需要修改工厂类，编译工厂类
 * @author zwl
 *
 */
public class OperationFactory
{
    public static Operation createOperation(char oper)
    {
        Operation op=null;
        switch (oper)
        {
            case '+':
                op=new OperationAdd();
                break;
            case '-':
                op=new OperationSub();
                break;
            case '*':
                op=new OperationMul();
                break;
            case '/':
                op=new OperationDiv();
                break;
            default:
                break;
        }
        return op;
    }

}
