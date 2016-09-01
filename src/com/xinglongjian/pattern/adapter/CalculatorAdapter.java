package com.xinglongjian.pattern.adapter;

public class CalculatorAdapter {

	Calculator calculator;
	Triangle triangle;
	/**
	 * 这里通过将计算三角形的面积 转换为计算矩形的面积，来完成适配
	 * 
	 * 使得通过该适配器也能通过计算矩形面积的类来计算三角形的面积
	 * @param t
	 * @return
	 */
	public double getArea(Triangle t){
		calculator=new Calculator();
		triangle=t;
		Rect r=new Rect();
		r.l=triangle.b;
		r.w=0.5*triangle.h;
		
		return calculator.getArea(r);
	}
}
