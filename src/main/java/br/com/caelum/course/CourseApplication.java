package br.com.caelum.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}
	/*
	@Bean
	RestTemplate restTemplate(RestTemplateBuilder rtb) {
		return rtb.build();
	}
	
	@Bean
	public CommandLineRunner clr(ServiceCircuitBreaker service){
		return args->{
			service.request();
		};
	}*/
}
