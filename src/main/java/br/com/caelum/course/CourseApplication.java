package br.com.caelum.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrix
@SpringBootApplication
@EnableFeignClients
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate(RestTemplateBuilder rtb) {
		return rtb.build();
	}
	
	@Bean
	public CommandLineRunner clr(ServiceCircuitBreaker service){
		return args->{
			service.request();
		};
	}
}
