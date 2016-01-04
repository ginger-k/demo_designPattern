package com.fccs.dp.create.factory.factoryMethod;

public class FinancialHtmlExporter implements Exporter {

	@Override
	public boolean export(String data) {
		System.out.println("导出财务版HTML文件");
		return true;
	}

}
