package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.service.CalculatorService;

public class MainApp {

	public static void main(String[] args) {
		// step-1 (initialize the container)
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CalculatorService cs =(CalculatorService)ctx.getBean("service");
		
		System.out.println(cs.service(7687));

	}

}
