package com.xinglongjian.pattern.decorator;
/**
 * 装饰者模式
 * 
 * 可以对现有的类动态添加新功能，提高灵活性。也就是在原有的基础上再封装一层，装修一下。
 * 
 * 不能修改已有的功能，但可以扩展他们。也就是说该模式对扩展开放，对修改关闭。
 * 
 * @author zwl
 *
 */
public class DecoratorPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Component com=new ConcreteComponent();
		/**
		 * 通过封装Component，可以添加额外功能
		 */
		ConcreteDecoratorExOne one=new ConcreteDecoratorExOne();
		one.setTheComponent(com);
		one.doJob();
		
		ConcreteDecoratorExTwo two=new ConcreteDecoratorExTwo();
		two.setTheComponent(com);
		two.doJob();
		
		
	}

}
