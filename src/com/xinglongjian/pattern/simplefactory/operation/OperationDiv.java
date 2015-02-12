package com.xinglongjian.pattern.simplefactory.operation;

public class OperationDiv extends Operation
{

    @Override
    public double getResult()
    {
        // TODO Auto-generated method stub
        if(getNumberB()==0)
            throw new IllegalArgumentException();
        return getNumberA() / getNumberB();
    }

}
