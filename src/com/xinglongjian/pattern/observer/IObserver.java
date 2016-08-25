package com.xinglongjian.pattern.observer;
/**
 * 定义观察者接口
 * @author zwl
 *
 * 2016年8月25日 下午3:49:41
 */
public interface IObserver {
    /**
     * 当被观察对象发生变化后，执行观察者的该方法
     */
	public void update();
}
