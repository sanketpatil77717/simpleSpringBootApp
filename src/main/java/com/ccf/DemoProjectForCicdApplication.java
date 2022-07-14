package com.ccf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoProjectForCicdApplication extends SpringBootServletInitializer  {

	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(DemoProjectForCicdApplication.class);
	    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoProjectForCicdApplication.class, args);
	}

}
