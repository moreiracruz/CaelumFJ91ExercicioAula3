package br.com.caelum.course.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Course {

	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(columnDefinition="BINARY(16)")
	private UUID id;
	
	private String name;
	private Integer duration;
	
	private Category category;
	
	private String userId;
	
	@Transient
	private String userName;
	
	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getDuration() {
		return duration;
	}
	public Category getCategory() {
		return category;
	}
	public String getUserId() {
		return userId;
	}

	/*
	public String getUserName(){
		return new UserRest().getUserName(userId);
	}
	*/
	
}
