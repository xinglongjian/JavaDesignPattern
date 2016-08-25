package com.xinglongjian.pattern.observer;
/**
 * 定义一个被观察者超类
 * @author zwl
 *
 * 2016年8月25日 下午3:54:03
 */
public interface IObserable {
   void register(IObserver o);
   void unregister(IObserver o);
   void notifyObservers();
}
