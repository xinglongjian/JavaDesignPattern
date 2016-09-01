package com.xinglongjian.pattern.adapter;
/**
 * 计算器
 * 
 * 该计算器只能计算矩形的面积，如果让他也能计算三角形的面积？
 * @author zwl
 *
 */
public class Calculator {

	Rect rectangle;
	public double getArea(Rect r){
		rectangle=r;
		return rectangle.l*rectangle.w;
	}
}
