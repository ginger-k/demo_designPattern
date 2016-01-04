package com.fccs.dp.structure.adapter.adapter4interface;

public class Client {

	
	/*
	 * 目标接口有很多抽象方法，只想实现某个方法
	 */
	public static void main(String[] args) {
		Target target = new Wrapper();
		target.method2();
	}
	
}
