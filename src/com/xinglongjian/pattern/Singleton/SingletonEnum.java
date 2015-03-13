package com.xinglongjian.pattern.Singleton;


public class SingletonEnum {

	private SingletonEnum(){}
	private static final SingletonEnum INSTANCE=new SingletonEnum();
	public enum Singleton
	{
		INSTANCE
	}
}
