package br.com.caelum.course.api;

import br.com.caelum.course.model.User;
import feign.Feign;
import feign.gson.GsonDecoder;

public class UserAPI {
	
	public User getUser(){
		User user = Feign.builder()
						 .decoder(new GsonDecoder())
						 .target(User.class, "https://192.168.0.241");
		
		return user;

	}
	

}
