package br.com.caelum.course.model;

import java.util.UUID;

import org.springframework.context.annotation.Bean;

public class User {
	private UUID id;
	private String nome;
	private String email;
	
	
	public UUID getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
}
