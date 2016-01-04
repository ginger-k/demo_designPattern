package com.fccs.dp.behavior.strategy;

public class Book {
	
	private double price;
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getMemberPrice(MemberStrategy memberStrategy) {
		return memberStrategy.memberPrice(this.price);
	}

	
	
}
