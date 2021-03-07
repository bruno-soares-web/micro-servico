package br.com.springdataredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringdataredisApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdataredisApplication.class, args);

	}

}
