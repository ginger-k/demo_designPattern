package com.fccs.dp.create.singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		System.out.println(Singleton1.getInstance());
		System.out.println(Singleton1.getInstance());
		System.out.println(Singleton1.getInstance());
		
		System.out.println(Singleton2.getInstance());
		System.out.println(Singleton2.getInstance());
		System.out.println(Singleton2.getInstance());
		
		System.out.println(SingletonEnum.uniqueInstance);
		System.out.println(SingletonEnum.uniqueInstance);
		System.out.println(SingletonEnum.uniqueInstance);
		
	}

}
