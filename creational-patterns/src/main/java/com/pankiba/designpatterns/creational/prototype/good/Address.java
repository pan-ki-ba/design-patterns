package com.pankiba.designpatterns.creational.prototype.good;

public class Address  implements Cloneable{

	private String city;
	private String state;
	private String country;

	public Address(String city, String state, String country) throws InterruptedException {
		Thread.sleep(1000);
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

//	@Override
//	public String toString() {
//		return city+", "+state+", "+country+".";
//	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}