package com.xinglongjian.pattern.simplefactory.operation;

public class OperationAdd extends Operation
{

    @Override
    public double getResult()
    {
        // TODO Auto-generated method stub
        return getNumberA()+getNumberB();
    }

}
