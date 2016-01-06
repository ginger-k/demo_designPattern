package com.fccs.dp.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedList;


public class DataSource {

	private LinkedList<Conn> pool = new LinkedList<Conn>();
	private int initCount = 5;
	
	public DataSource() {
		for (int i = 0; i < initCount; i++) {
			Conn conn = new Connection();
			pool.add(conn);
		}
	}
	
	public int getSize() {
		return pool.size();
	}
	
	
	public Conn getConn() {
		pool.removeFirst();

		//不使用代理
		//return new Connection();
		
		//使用自己的静态代理
		//return new ProxyConnection(pool);
		
		//使用jdk提供的动态代理
		final Conn conn = new Connection();
		Conn proxyConn = (Conn) Proxy.newProxyInstance(conn.getClass().getClassLoader(), conn.getClass().getInterfaces(), new InvocationHandler(){
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if ("close".equals(method.getName())) {
					pool.add(conn);
				}
				return null;
			}});
		return proxyConn;
	}
	
}
