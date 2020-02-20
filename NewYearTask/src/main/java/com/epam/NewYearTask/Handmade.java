package com.epam.NewYearTask;

public class Handmade extends NewYGift {
		public Handmade(String sname,int sqty) {
			super(sname,sqty);
		}
		@Override
		void wrap() {
			System.out.println(this.getGName()+" is gift wrapped!");
		}

	}

