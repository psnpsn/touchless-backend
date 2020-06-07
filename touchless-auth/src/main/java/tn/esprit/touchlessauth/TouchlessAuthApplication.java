package tn.esprit.touchlessauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
@EnableEurekaClient
public class TouchlessAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouchlessAuthApplication.class, args);
	}

}
