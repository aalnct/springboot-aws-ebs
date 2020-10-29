package com.springboot.aws.ebs.springbootawsebs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
@Configuration
public class SpringbootAwsEbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsEbsApplication.class, args);
	}

}
