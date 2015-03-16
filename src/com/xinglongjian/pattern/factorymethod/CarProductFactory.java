package com.xinglongjian.pattern.factorymethod;
/**
 * 汽车的具体工厂类
 * @author zwl
 *
 */
public class CarProductFactory implements IAbstractProductFactory {

	@Override
	public AbstractProduct createProduct() {
		// TODO Auto-generated method stub
		return new CarProduct();
	}

}
