package com.examly.springapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
public class User  implements Serializable {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String role;
	private String email;
	private String userName;
	private String mobileNumber;
	private String password;
	private String confirmPassword;

	@Override
	public String toString() {
		return "User [confirmPassword=" + confirmPassword + ", email=" + email + ", id=" + id + ", mobileNumber="
				+ mobileNumber + ", password=" + password + ", role=" + role + ", userName=" + userName + "]";
	}
	
	public User() {
	}
	public User(Long id, String role, String email, String userName, String mobileNumber, String password,
			String confirmPassword) {
		this.id = id;
		this.role = role;
		this.email = email;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
}
