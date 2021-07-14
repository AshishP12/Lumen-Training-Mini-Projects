package com.training;

public class Application {

	public static void main(String[] args) {
		Greeting javagreet = new Greeting();
		System.out.println(javagreet.getGreeting());
		System.out.println(javagreet.getGreeting(args[0]));
	}

}
