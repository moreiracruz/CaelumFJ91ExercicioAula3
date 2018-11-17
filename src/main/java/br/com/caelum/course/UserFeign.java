package br.com.caelum.course;

import java.util.List;

import feign.Param;
import feign.RequestLine;

public interface UserFeign {

	@RequestLine("GET /api/users")
	List<User> users();
	
	@RequestLine("GET /api/users/{id}")
	User user(@Param("id") String id);
	
}
