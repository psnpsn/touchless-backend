package tn.esprit.touchlessusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TouchlessUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouchlessUsersApplication.class, args);
	}

}
