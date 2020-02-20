package com.epam.NewYearTask;

public class Chocolates extends NewYGift {
	public Chocolates(String cname,int cqty) {
		super(cname,cqty);
	}
	@Override
	void wrap() {
		System.out.println(this.getGName()+" is gift wrapped!");
	}
}
