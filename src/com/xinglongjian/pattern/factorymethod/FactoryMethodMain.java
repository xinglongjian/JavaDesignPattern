package com.xinglongjian.pattern.factorymethod;

import java.util.List;

public class FactoryMethodMain {

	public static void main(String[] args) {
		//定义个具体的小汽车工厂
		IAbstractProductFactory bpf=new CarProductFactory();
		//创建具体的私家小汽车
		AbstractProduct car=bpf.createProduct();
		System.out.println(car.getName());
		
	}
}
