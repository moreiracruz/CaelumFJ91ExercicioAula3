package br.com.caelum.course;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ServiceCircuitBreaker {
	
	@HystrixCommand(fallbackMethod = "fallback")
	public void request(){
		throw new RuntimeException();
	}
	
	public void fallback(){
		System.out.println("Deu ruim");
	}

}
