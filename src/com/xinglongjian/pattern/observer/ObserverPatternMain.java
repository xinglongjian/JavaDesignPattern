package com.xinglongjian.pattern.observer;

public class ObserverPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject sub=new Subject();
		
		IObserver ob1=new Observer1();
		IObserver ob2=new Observer2();
		
		sub.register(ob1);
		sub.register(ob2);
		
		sub.setValue();
		
		sub.unregister(ob2);
		
		sub.setValue();
	}

}
