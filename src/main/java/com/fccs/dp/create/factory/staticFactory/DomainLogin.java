package com.fccs.dp.create.factory.staticFactory;

public class DomainLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		/*
		 * 域认证逻辑
		 */
		return false;
	}

}
