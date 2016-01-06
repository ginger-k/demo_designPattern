package com.fccs.dp.structure.decorator;

import java.util.LinkedList;

public class ConnectionWrapper implements Conn{

	private Conn conn;
	private LinkedList<Conn> pool;
	
	public ConnectionWrapper(Conn conn, LinkedList<Conn> pool) {
		this.conn = conn;
		this.pool = pool;
	}
	
	@Override
	public void close() {
		pool.add(conn);
	}

}
