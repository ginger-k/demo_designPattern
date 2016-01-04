package com.fccs.dp.create.factory.factoryMethod;

public class HtmlExporterFactory implements ExporterFactory {

	@Override
	public Exporter create(String type) {
		if (type.equals("standard")) {
			return new StandardHtmlExporter();
		} else if (type.equals("financial")) {
			return new FinancialHtmlExporter();
		} else{
            throw new RuntimeException("没有找到对象");
        }
	}

}
