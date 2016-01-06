package com.fccs.dp.structure.decorator;

public class Connection implements Conn{

	@Override
	public void close() {
		System.out.println("连接关闭。。。");
	}
	
}
