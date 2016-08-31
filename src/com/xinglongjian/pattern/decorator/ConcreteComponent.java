package com.xinglongjian.pattern.decorator;
/**
 * 被装饰物体的具体实现类
 * @author zwl
 *
 */
public class ConcreteComponent extends Component {

	/**
	 * 该方法是该类已有的功能，不能修改
	 */
	@Override
	public void doJob() {
		// TODO Auto-generated method stub
        System.out.println("I am from Concrete Component-1 am closed for modification.");
	}

}
