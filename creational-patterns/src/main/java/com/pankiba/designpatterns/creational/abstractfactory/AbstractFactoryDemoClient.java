package com.pankiba.designpatterns.creational.abstractfactory;

public class AbstractFactoryDemoClient {

	public void buildVehicle(int selectedVehicleId, int brandId) {
		
		VehicleFactoryPicker.getFactory(brandId).startBuildProcess(selectedVehicleId).buildVehicle();
		
	}

	public static void main(String[] args) {

		AbstractFactoryDemoClient abstractFactoryDemoClient = new AbstractFactoryDemoClient();

		abstractFactoryDemoClient.buildVehicle(1, 1);
		abstractFactoryDemoClient.buildVehicle(1, 2);
		abstractFactoryDemoClient.buildVehicle(2, 1);
		abstractFactoryDemoClient.buildVehicle(2, 2);

	}

}
