package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.MobilePlan;

@SpringBootApplication
public class MobilePlanServiceApplication {
	
	// in spring default beans are eagerly created
	//we can make them create lazily by adding annotation @lazy
	
	
	//beans are singleton by default if they are not singleton then they are prototype 
//scope from singleton to prototype is done by using the annotation @prototype
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MobilePlanServiceApplication.class, args);
		
		
		  MobilePlan plan=ctx.getBean("mobilePlan",MobilePlan.class);
		  System.out.println(plan);
		 
		  MobilePlan plan2=ctx.getBean("mobilePlan",MobilePlan.class);
		  System.out.println(plan2);
		  
	  System.out.println("is singleton :="+ctx.isSingleton("mobilePlan"));
	  System.out.println("is prototype :="+ctx.isPrototype("mobilePlan"));
	}

	
@Bean
public MobilePlan prePaid() {
	
	return new MobilePlan(200,"plan399",400,28);
}
	
@Bean
public MobilePlan postPaid() {
	
	return new MobilePlan(299,"monthly",399,39);
}
	
}
