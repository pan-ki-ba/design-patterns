package com.pankiba.designpatterns.creational.prototype.good;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PrototypeDemoClient {
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		
		long startTime = new Date().getTime();
		 
		System.out.println("Start Time :- "+startTime);
		
		Customer customer = new Customer("pankiba", "Mumbai", "MH", "India");
		for(int i=0; i < 10; i++){
			Customer customerCopy = (Customer)customer.clone();
			System.out.print(" ");
			System.out.println(customerCopy);
		}
		
		long endTime = new Date().getTime();
		
		System.out.println("End Time :- "+endTime);
		System.out.println(" Time to create 10 customer objects using clone :- "+TimeUnit.MILLISECONDS.toSeconds(endTime-startTime)+" seconds.");
	}
}
