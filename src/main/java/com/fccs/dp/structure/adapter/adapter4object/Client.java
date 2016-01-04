package com.fccs.dp.structure.adapter.adapter4object;

public class Client {

	
	/*
	 * 把被适配类的API转换成为目标类的API
	 * 不是使用继承关系连接到Adaptee类，而是使用委派关系连接到Adaptee类。
	 */
	public static void main(String[] args) {
		Adaptee source = new Adaptee();
		Target target = new Adapter(source);
		target.targetInterfaceMethod();
	}
	
}
