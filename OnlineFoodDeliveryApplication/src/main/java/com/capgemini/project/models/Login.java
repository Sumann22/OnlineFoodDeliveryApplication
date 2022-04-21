package com.capgemini.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userid;
	private String username;
	private String password;
	@Override
	public String toString() {
		return "Login [userid=" + userid + ", username=" + username + ", password=" + password + "]";
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(Long userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	public Login() {
		super();
	}

}

