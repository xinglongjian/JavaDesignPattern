package com.xinglongjian.pattern.facade;
/**
 * 设置材料
 * @author zwl
 *
 * 2016年8月25日 下午4:19:47
 */
public class RobotMetal {

	private String metal;
	
	public void setMetal(String metal){
		this.metal=metal;
		System.out.println("Color is set to:"+this.metal);
	}
}
