package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.test.config.AppCacheManager;
import com.test.config.JpaConfiguration;

@Import({ JpaConfiguration.class, AppCacheManager.class })
@SpringBootApplication(scanBasePackages={"com.test.controller", "com.test.service", "com.test.repositories"})
public class SpringbootcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudApplication.class, args);
	}
}
