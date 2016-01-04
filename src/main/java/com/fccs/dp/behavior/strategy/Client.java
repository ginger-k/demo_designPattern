package com.fccs.dp.behavior.strategy;

public class Client {

	
	public static void main(String[] args) {
		Book book = new Book();
		book.setPrice(100.0);
		double memberPrice = book.getMemberPrice(new IntermediateMemberStrategy());
		System.out.println("会员价：" + memberPrice);
		
		//匿名内部类
		double memberPrice2 = book.getMemberPrice(new MemberStrategy() {
			@Override
			public double memberPrice(double price) {
				return price*0.2;
			}
		});
		System.out.println("高级会员：" + memberPrice2);
	}
	
}
