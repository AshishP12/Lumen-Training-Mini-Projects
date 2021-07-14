package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable exp=() ->{
			
		for(int i=0;i<=5;i++) {
			
			System.out.println("Hi lambda");
		}	
			
		};
		
		Thread t= new Thread(exp);
		
		t.start();
	}

}
