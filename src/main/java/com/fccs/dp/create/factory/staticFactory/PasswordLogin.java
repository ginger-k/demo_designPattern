package com.fccs.dp.create.factory.staticFactory;

public class PasswordLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		/*
		 *  口令登录逻辑
		 */
		return false;
	}

}
