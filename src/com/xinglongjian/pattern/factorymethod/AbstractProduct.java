package com.xinglongjian.pattern.factorymethod;
/**
 * 该类为产品的抽象类
 * @author zwl
 *
 */
public abstract class AbstractProduct {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
