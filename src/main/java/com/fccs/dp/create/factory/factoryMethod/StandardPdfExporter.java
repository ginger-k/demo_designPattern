package com.fccs.dp.create.factory.factoryMethod;

public class StandardPdfExporter implements Exporter {

	@Override
	public boolean export(String data) {
		System.out.println("导出标准PDF文件");
		return true;
	}

}
