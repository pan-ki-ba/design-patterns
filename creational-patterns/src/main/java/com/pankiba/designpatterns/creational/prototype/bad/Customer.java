package com.pankiba.designpatterns.creational.prototype.bad;

public class Customer {

	private String customerName;
	private Address customerAddress;

	public Customer(String customerName, String city, String state, String country) throws InterruptedException {
		this.customerName = customerName;
		this.customerAddress = new Address(city, state, country);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	@Override
	public String toString() {
		return "Name : "+customerName +" , Address : "+customerAddress;
	}

}