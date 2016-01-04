package com.fccs.dp.structure.adapter.adapter4object;

public class Adapter implements Target {

	private Adaptee source;
	
	public Adapter(Adaptee source) {
		this.source = source;
	}
	
	@Override
	public void targetInterfaceMethod() {
		source.adapteeMethond();
	}

}
