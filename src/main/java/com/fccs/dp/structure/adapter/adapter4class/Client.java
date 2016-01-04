package com.fccs.dp.structure.adapter.adapter4class;

public class Client {
	
	
	/*
	 * 把被适配类的API转换成为目标类的API。
	 * Adaptee类并没有targetInterfaceMethod()方法，而客户端则期待这个方法。
	 * 为使客户端能够使用Adaptee类，提供一个中间环节，即类Adapter，把Adaptee的API与Target类的API衔接起来。
	 * Adapter与Adaptee是继承关系
	 */
	public static void main(String[] args) {
		Target target = new Adapter();
		target.targetInterfaceMethod();
	}

}
