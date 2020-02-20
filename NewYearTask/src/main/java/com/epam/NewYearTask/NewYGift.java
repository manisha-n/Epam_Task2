package com.epam.NewYearTask;

public abstract class NewYGift
{
    private String giftname;
    private int giftqty;
    public NewYGift(String name,int qty) {
    	giftname=name;
    	giftqty=qty;
    }
    public void setGName(String x) {
    	giftname=x;
    }
    public String getGName() {
    	return giftname;
    }
    public void setGQty(int y) {
    	giftqty=y;
    }
    public int getGQty() {
    	return giftqty;
    }
    abstract void wrap(); 	

}