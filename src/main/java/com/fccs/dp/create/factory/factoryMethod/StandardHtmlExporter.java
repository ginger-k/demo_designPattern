package com.fccs.dp.create.factory.factoryMethod;

public class StandardHtmlExporter implements Exporter {

	@Override
	public boolean export(String data) {
		System.out.println("导出标准HTML文件");
		return true;
	}

}
