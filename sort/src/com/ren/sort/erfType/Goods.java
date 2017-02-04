package com.ren.sort.erfType;

public class Goods {
	
	private int fav;
	private double price;
	private String name;
	public int getFav() {
		return fav;
	}
	public void setFav(int fav) {
		this.fav = fav;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Goods(int fav, double price, String name) {
		super();
		this.fav = fav;
		this.price = price;
		this.name = name;
	}
	public Goods(){
		
	}
	@Override
	public String toString() {
		return "商品名:"+this.name+"|收藏量:"+this.fav+"|价格："+this.price+"\n";
	}
	

}
