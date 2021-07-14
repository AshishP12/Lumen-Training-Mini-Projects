package com.training;

import com.training.model.MarutiCar;
import com.training.model.ToyotaCar;
import com.training.servicesP.PrintQuote;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintQuote quotePrinter = new PrintQuote();
		quotePrinter.printQuote(new MarutiCar());
		
		quotePrinter.printQuote(new ToyotaCar());
		

	}

}
