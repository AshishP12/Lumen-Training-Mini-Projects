package com.training;

public class Application {

	public static void main(String[] args) {
	
 Invoice tv= new Invoice();
 
    tv.setRateperunit(20000.00);
    tv.setInvoiceno(101);
    tv.setQunatity(50);
    
    System.out.println("price : ="+ tv.calculate());
    
    Invoice fridge=new Invoice();
    fridge.setInvoiceno(102);
    fridge.setQunatity(1);
    fridge.setRateperunit(-12000.00);
    
	}

}
