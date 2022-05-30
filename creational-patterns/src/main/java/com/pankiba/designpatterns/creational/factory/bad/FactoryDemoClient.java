package com.pankiba.designpatterns.creational.factory.bad;

public class FactoryDemoClient {
	
	VehicleFactory vehicleFactory = new VehicleFactory();
	
	public void buildVehicle(int selectedVehicle){
		Vehicle vehicle = vehicleFactory.createVehicle(selectedVehicle);
		vehicle.buildVehicle();
	}
	
	public static void main(String[] args) {
		
		FactoryDemoClient factoryDemoClient = new FactoryDemoClient();
		factoryDemoClient.buildVehicle(1);
		factoryDemoClient.buildVehicle(2);

	}

}
