package com.training.abstractfactory;

public class ColorFactory extends AbstractFactory{
	//we shall not have any implementation of vehicle method
	@Override
	public IVehicle getVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {
		if(color.equals("red")){
			return new Red();
		}else if(color.equals("blue")){
			return new Blue();
		}
		
		
		return null;
	}

}
