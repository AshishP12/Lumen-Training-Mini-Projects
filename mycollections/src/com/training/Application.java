package com.training;

import com.training.services.InvoiceService;
import java.util.*;
public class Application {

	public static void main(String[] args) {
	
 Invoice tv= new Invoice();
 
    tv.setRateperunit(20000.00);
    tv.setInvoiceno(101);
    tv.setQunatity(50);
    
   // System.out.println("price : ="+ tv.calculate());
    
    Invoice fridge=new Invoice();
    fridge.setInvoiceno(102);
    fridge.setQunatity(1);
    fridge.setRateperunit(-12000.00);
    
    InvoiceService service = new InvoiceService();
    
    
    service.save(tv);
    service.save(fridge);
    
	/*
	 * List<Invoice> list =service.findAll();
	 * 
	 * 
	 * for(Invoice eachElement: list) {
	 * 
	 * System.out.println(eachElement); }
	 */
    HashSet<Invoice> set=new HashSet<>();
System.out.println(set.add(fridge)); 
System.out.println(set.add(tv)); 
  
System.out.println(set.add(fridge)); 
    
    System.out.println(set);
         System.out.println("size:="+set.size());
	}

}
