package br.com.caelum.course;

import org.springframework.web.client.RestTemplate;

public class UserRest {
	
	public String getUserName(String userId){
		RestTemplate restTemplate = new RestTemplate();
		//new = restTemplate.getForObject(url, Message.class);
		
		return "";
		
	}
	
}
