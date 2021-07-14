package com.training.servicesP;

import com.training.ifaces.Automobile;

public class PrintQuote {

	
	public void printQuote(Automobile poly)
	{
		
		System.out.println("model:="+poly.getModel());
		System.out.println("color:="+poly.getColor());
		System.out.println("price:="+poly.getPrice());
	}

}
