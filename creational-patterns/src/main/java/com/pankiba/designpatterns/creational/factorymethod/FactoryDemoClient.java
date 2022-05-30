package com.pankiba.designpatterns.creational.factorymethod;


public class FactoryDemoClient {

	public void buildVehicle(VehicleFactory vehicleFactory) {
		vehicleFactory.startBuildProcess();
	}

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		
		FactoryDemoClient factoryDemoClient = new FactoryDemoClient();
		
		factoryDemoClient.buildVehicle(new CarFactory());
		factoryDemoClient.buildVehicle(new MotorCycleFactory());
		
	}

}
