package com.xinglongjian.pattern.decorator;
/**
 * 装饰器的抽象类，会有多个不同的装饰器继承
 * @author zwl
 *
 */
public abstract class AbstractDecorator extends Component {

	protected Component com;
	
	public void setTheComponent(Component c){
		com=c;
	}
	/**
	 * 这里也没有改变已有功能
	 */
	@Override
	public void doJob() {
		// TODO Auto-generated method stub
        if(com!=null){
        	com.doJob();
        }
	}

}
