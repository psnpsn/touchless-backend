package tn.esprit.touchlesstapread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TouchlessTapreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouchlessTapreadApplication.class, args);
	}

}
