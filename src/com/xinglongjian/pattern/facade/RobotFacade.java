package com.xinglongjian.pattern.facade;
/**
 * 整体对外的外观对象
 * @author zwl
 *
 * 2016年8月25日 下午4:28:31
 */
public class RobotFacade {

	RobotColor rc;
	RobotMetal rm;
	RobotBody rb;
	
	public RobotFacade(){
		rc=new RobotColor();
		rm=new RobotMetal();
		rb=new RobotBody();
	}
	
	public void constructRobot(String color,String metal){
		System.out.println("Creation of the Robot Start");
		rc.setColor(color);
		rm.setMetal(metal);
		rb.CreateBody();
        System.out.println("Creation of the Robot End");
	}
}
