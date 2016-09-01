package com.xinglongjian.pattern.adapter;
/**
 * 适配器模式
 * 
 * 用于将一个类的接口转换为另一个客户端期望的接口，
 * 
 * 该模式可以将让多个不兼容的接口协调工作。
 * @author zwl
 *
 */
public class AdapterPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***Adapter Pattern Demo***");
		CalculatorAdapter cal=new CalculatorAdapter();
		Triangle t=new Triangle(20, 10);
		System.out.println("\nAdapter Pattern Example\n");
		System.out.println("Area of Triangle is :"+cal.getArea(t));
	}

}
