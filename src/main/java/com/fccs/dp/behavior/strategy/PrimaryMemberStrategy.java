package com.fccs.dp.behavior.strategy;

public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double memberPrice(double price) {
		System.out.println("初级会员没有折扣");
		return price;
	}

}
