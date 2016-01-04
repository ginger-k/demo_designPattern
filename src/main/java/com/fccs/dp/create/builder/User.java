package com.fccs.dp.create.builder;

import java.util.Date;

public class User {
	
	private String name;
	private int age;
	private String sex;
	private Date birthday;
	private String address;
	
	public static class Builder {
		private String name = null;
		private int age = 0;
		private String sex = "男 ";
		private Date birthday = null;
		private String address = null;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Builder sex(String sex) {
			this.sex = sex;
			return this;
		}
		
		public Builder birthday(Date birthday) {
			this.birthday = birthday;
			return this;
		}
		
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
	
	private User(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.sex = builder.sex;
		this.birthday = builder.birthday;
		this.address = builder.address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address + "]";
	}

}