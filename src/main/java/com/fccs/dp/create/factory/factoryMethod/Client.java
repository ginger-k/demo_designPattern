package com.fccs.dp.create.factory.factoryMethod;

public class Client {
	
	public static void main(String[] args) {
		String data = "";
		ExporterFactory exporterFactory = new PdfExporterFactory();
		Exporter exporter = exporterFactory.create("standard");
		exporter.export(data);
	}

}
