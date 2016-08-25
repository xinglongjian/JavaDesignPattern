package com.xinglongjian.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements IObserable {

	/**
	 * 当该值改变后,通知其他观察者
	 */
	public void setValue(){
		System.out.println("value changed");
		notifyObservers();
	}
	
	
	List<IObserver> observersList=new ArrayList<>();
	
	@Override
	public void register(IObserver o) {
		// TODO Auto-generated method stub
		observersList.add(o);
	}

	@Override
	public void unregister(IObserver o) {
		// TODO Auto-generated method stub
		observersList.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub

		for(IObserver o:observersList){
			o.update();
		}
	}

}
