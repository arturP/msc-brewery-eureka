package io.artur.spring.brewery.eureka.mscbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MscBreweryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscBreweryEurekaApplication.class, args);
	}

}
