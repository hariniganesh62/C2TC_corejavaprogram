package com.tnsif.day5.association.hieraricalinhertance.Vehicle;

public class VehicleDemo {

	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.vehicleType();
		
		Maruthi m=new Maruthi();
		m.vehicleType();
		m.brand();
		m.speed();
		
		Maruti800 m1=new Maruti800();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
		
	}

}
