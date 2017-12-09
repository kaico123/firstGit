package com.itheima.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //默認掃描本包及子包
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
