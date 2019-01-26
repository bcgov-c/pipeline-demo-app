package ca.bc.gov.iamp.demo.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCircuitBreaker
@ComponentScan(basePackages = "ca.bc.gov.iamp")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
