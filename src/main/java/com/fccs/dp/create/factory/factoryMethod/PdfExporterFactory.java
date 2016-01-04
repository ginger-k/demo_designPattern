package com.fccs.dp.create.factory.factoryMethod;

public class PdfExporterFactory implements ExporterFactory {

	@Override
	public Exporter create(String type) {
		if (type.equals("standard")) {
			return new StandardPdfExporter();
		} else if (type.equals("financial")) {
			return new FinancialPdfExporter();
		} else{
            throw new RuntimeException("没有找到对象");
        }
	}

}
