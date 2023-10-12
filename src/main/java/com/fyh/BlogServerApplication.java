package com.fyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class BlogServerApplication extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(BlogServerApplication.class);
//	}
//
//	public static void main(String[] args) throws Exception {
//		SpringApplication.run(BlogServerApplication.class, args);
//	}
//
//}

@SpringBootApplication
public class BlogServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogServerApplication.class, args);
	}
}
