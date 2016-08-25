package com.xinglongjian.pattern.facade;
/**
 * 外观模式
 * 
 * 将子系统的多个接口，提供了一个统一的接口。通过该统一的接口对外提供服务。
 * 
 * @author zwl
 *
 * 2016年8月25日 下午4:09:43
 */
public class FacadePatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RobotFacade rf1=new RobotFacade();
		rf1.constructRobot("Green", "Iron");
		RobotFacade rf2=new RobotFacade();
		rf2.constructRobot("Red", "Steel");
	}

}
