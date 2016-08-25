package com.xinglongjian.pattern.observer;
/**
 * 定义一个具体的观察者
 * @author zwl
 *
 * 2016年8月25日 下午3:51:03
 */
public class Observer1 implements IObserver {

	@Override
	public void update() {
		// TODO Auto-generated method stub
        System.out.println("object changed,observer1 response!");
	}

}
