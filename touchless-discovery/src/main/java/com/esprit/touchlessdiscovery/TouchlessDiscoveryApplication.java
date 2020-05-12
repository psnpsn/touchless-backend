package com.esprit.touchlessdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TouchlessDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouchlessDiscoveryApplication.class, args);
	}

}
