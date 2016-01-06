package com.fccs.dp.structure.proxy;

import java.util.LinkedList;

public class ProxyConnection implements Conn{

	private Conn conn = new Connection();
	private LinkedList<Conn> pool;
	
	public ProxyConnection(LinkedList<Conn> pool) {
		this.pool = pool;
	}
	
	@Override
	public void close() {
		pool.add(conn);
	}

}
