package com.xinglongjian.pattern.factorymethod;
/**
 * 卡车的具体工厂类
 * @author zwl
 *
 */
public class TruckProductFactory implements IAbstractProductFactory {

	@Override
	public AbstractProduct createProduct() {
		// TODO Auto-generated method stub
		return new TruckProduct();
	}

}
