package com.training;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class UsingBuiltInFunctionalInterface {

	
	public void usingPredicate() {
		
		Predicate<Double> checkingHousingLoanEligibility=
				(salaryPerMonth) ->{
					
					
					boolean result =false;
					if(salaryPerMonth>30000) {
						
						result =true;
					}
					return result;
				};
	
	System.out.println("Ramesh with salary 2000 is eligible:"+ checkingHousingLoanEligibility.test(20000.0));
	System.out.println("Suresh with salary 8000 is eligible:"+ checkingHousingLoanEligibility.test(80000.0));
	}
	
	public void usingConsumer() {
		
		List<String> names=new ArrayList<>();
		names.add("ASHISH");
		names.add("Abhishek");
		names.add("Amit");
		names.add("Aditya");
		
		/*
		 * Consumer<String> print =(name) -> System.out.println(name);
		 * 
		 * names.forEach(print);
		 */
		names.forEach(System.out::println);
	}
	
	
	public void usingFunction() {
		
		
		Function<Double,Double> currencyConverter= (inr) -> inr/70;
	
	System.out.println("INR to USD"+currencyConverter.apply(100.00));
	}
	
	
	
	public static void main(String[] args) {
		
		UsingBuiltInFunctionalInterface obj= new UsingBuiltInFunctionalInterface();
		obj.usingPredicate();
		obj.usingConsumer();
obj.usingFunction();
	}
}
