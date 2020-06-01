package tn.esprit.touchlesssensor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TouchlessSensorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouchlessSensorApplication.class, args);
	}

}
