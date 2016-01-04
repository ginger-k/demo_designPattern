package com.fccs.dp.behavior.strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double memberPrice(double price) {
		System.out.println("中级会员10%");
		return price*0.1;
	}

}
