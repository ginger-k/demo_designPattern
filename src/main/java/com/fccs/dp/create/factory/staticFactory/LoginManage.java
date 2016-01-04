package com.fccs.dp.create.factory.staticFactory;

/*
 * 工厂类，根据需求创建Login
 */
public class LoginManage {
	
	public static Login factory(String type) {
		if (type.equals("password")) {
			return new PasswordLogin();
		} else if (type.equals("domain")) {
			return new DomainLogin();
		} else {
			throw new RuntimeException("没有找到登录类型");
		}
	}

}
