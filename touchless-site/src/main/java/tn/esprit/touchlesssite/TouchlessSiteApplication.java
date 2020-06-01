package tn.esprit.touchlesssite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TouchlessSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouchlessSiteApplication.class, args);
	}

}
