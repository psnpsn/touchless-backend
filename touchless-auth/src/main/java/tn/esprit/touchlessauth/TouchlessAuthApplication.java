package tn.esprit.touchlessauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TouchlessAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouchlessAuthApplication.class, args);
	}

}
