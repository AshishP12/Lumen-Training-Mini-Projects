package com.training.model;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 60000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "maruti";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "black";
	}

}
