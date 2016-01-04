package com.fccs.dp.create.factory.factoryMethod;

public class FinancialPdfExporter implements Exporter {

	@Override
	public boolean export(String data) {
		System.out.println("导出财务版PDF文件");
		return true;
	}

}
