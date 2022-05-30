package com.pankiba.designpatterns.creational.prototype.good;

public class Customer implements Cloneable{

	private String customerName;
	private Address customerAddress;

	public Customer(String customerName, String city, String state, String country) throws InterruptedException {
		Thread.sleep(1000);
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// deep cloning is used
		Customer customer = (Customer)super.clone();
		customer.customerAddress = (Address) customerAddress.clone();
		
		return customer;
	}

}