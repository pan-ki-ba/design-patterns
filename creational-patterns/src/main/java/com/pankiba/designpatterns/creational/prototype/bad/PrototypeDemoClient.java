package com.pankiba.designpatterns.creational.prototype.bad;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PrototypeDemoClient {
	public static void main(String[] args) throws InterruptedException {
		
		long startTime = new Date().getTime();
		 
		System.out.println("Start Time :- "+startTime);
		
		for(int i=0; i < 10; i++){
			Customer customer = new Customer("pankiba", "Mumbai", "MH", "India");
			System.out.print(" ");
			System.out.println(customer);
		}
		
		long endTime = new Date().getTime();
		
		System.out.println("End Time :- "+endTime);
		System.out.println("Time to create 10 customer objects :- "+TimeUnit.MILLISECONDS.toSeconds(endTime-startTime)+" seconds.");
	}
}
