package br.com.caelum.course;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.course.model.Course;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Value("service.user.ip")
	private String userIp;
		
	@Autowired
	CourseRepository repository;
	
	@GetMapping
	public Iterable<Course> list(){
		return this.repository.findAll();
	}
	
	@GetMapping("{id}")
	public Course get(@PathVariable String id){
		return this.repository.findById(UUID.fromString(id)).get();
	}
	
	@PostMapping
	public Course create(@RequestBody Course course){
		return this.repository.save(course);
	}
	
}
