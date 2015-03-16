package com.xinglongjian.pattern.factorymethod;

import java.net.URL;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JdkFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new LinkedList<String>();
		list.add("1111");
		list.add("2222");
		list.add("3333");
		Iterator<String> it=list.iterator();
		
		List<String> lists=new ArrayList<String>();
		lists.add("1111");
		lists.add("2222");
		lists.add("3333");
		Iterator<String> its=lists.iterator();
		
		DriverManager dm;
		Runtime r;
	}

}
