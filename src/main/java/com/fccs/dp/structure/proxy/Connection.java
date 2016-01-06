package com.fccs.dp.structure.proxy;

public class Connection implements Conn{

	@Override
	public void close() {
		System.out.println("连接关闭。。。");
	}
	
}
