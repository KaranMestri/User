package com.Info.user;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String text;
	private LocalDate dateofcomment;
	
	
	public User(Long id, String username, String text, LocalDate dateofcomment) {
		super();
		this.id = id;
		this.username = username;
		this.text = text;
		this.dateofcomment = dateofcomment;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDate getDateofcomment() {
		return dateofcomment;
	}
	public void setDateofcomment(LocalDate dateofcomment) {
		this.dateofcomment = dateofcomment;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", text=" + text + ", dateofcomment=" + dateofcomment
				+ "]";
	}
	
	
}
