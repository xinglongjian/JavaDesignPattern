package com.xinglongjian.pattern.facade;
/**
 * 设置颜色
 * @author zwl
 *
 * 2016年8月25日 下午4:19:47
 */
public class RobotColor {

	private String color;
	public void setColor(String color){
		this.color=color;
		System.out.println("Color is set to:"+this.color);
	}
}
