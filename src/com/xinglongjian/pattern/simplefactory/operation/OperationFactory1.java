package com.xinglongjian.pattern.simplefactory.operation;
/**
 * 
 * @author zwl
 *
 */
public class OperationFactory1
{

    /**
     * 这样无论增加多种操作，工厂类都不需要修改、编译
     * @param type
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     */
    public static Operation createOperation(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
        Operation oper=(Operation) Class.forName(type).newInstance();
        return oper;
    }
}
