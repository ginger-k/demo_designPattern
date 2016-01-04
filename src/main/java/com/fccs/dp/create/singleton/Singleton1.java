package com.fccs.dp.create.singleton;

public class Singleton1 {
	
	//静态初始化器，由JVM来保证线程安全
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {
		
	}
	
	public static Singleton1 getInstance() {
		return instance;
	}

}
