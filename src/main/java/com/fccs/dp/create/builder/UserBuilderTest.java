package com.fccs.dp.create.builder;

import java.util.Date;

public class UserBuilderTest {
	
	public static void main(String[] args) {
		User user = new User.Builder()
						.name("科比")
						.age(38)
						.sex("男")
						.birthday(new Date())
						.address("US_LA").build();
		System.out.println(user);
	}
	
	
}
