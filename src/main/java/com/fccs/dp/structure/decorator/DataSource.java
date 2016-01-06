package com.fccs.dp.structure.decorator;

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
		Conn conn = pool.removeFirst();
		return new ConnectionWrapper(conn, pool);
	}
	
	
}
