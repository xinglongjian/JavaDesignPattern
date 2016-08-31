package com.xinglongjian.pattern.decorator;
/**
 * 具体装饰器实现类-2
 * @author zwl
 *
 */
public class ConcreteDecoratorExTwo extends AbstractDecorator {

	public void doJob(){
		System.out.println("----------");
		//执行该功能之前处理
		super.doJob();
		//执行该功能之后处理
		System.out.println("I am Ex-2");
	}
}
