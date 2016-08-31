package com.xinglongjian.pattern.decorator;
/**
 * 具体装饰器类-1
 * @author zwl
 *
 */
public class ConcreteDecoratorExOne extends AbstractDecorator {

	public void doJob(){
		super.doJob();
		//这里添加额外的功能
		System.out.println("I am explicitly from Ex-1");
	}
}
