package com.pankiba.designpatterns.creational.factory.good;

public class FactoryDemoClient {
	
	VehicleFactory vehicleFactory = new VehicleFactory();
	
	public FactoryDemoClient(){
		vehicleFactory.registerVehicle(1, Car.class);
		vehicleFactory.registerVehicle(2, MotorCycle.class);
	}
	
	public void buildVehicle(int selectedVehicle) throws InstantiationException, IllegalAccessException{
		// It refers to the newly created object through a common interface
		Vehicle vehicle = vehicleFactory.createVehicle(selectedVehicle);
		vehicle.buildVehicle();
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		FactoryDemoClient factoryDemoClient = new FactoryDemoClient();
		factoryDemoClient.buildVehicle(1);
		factoryDemoClient.buildVehicle(2);

	}

}
