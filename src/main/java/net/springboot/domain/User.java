package net.springboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue // id의 값을 가져와 1을 증가시켜줌
	private Long id;

	@Column(nullable = false, length = 20) // nullable가 false이면 NULL값이 들어갈 수 없다.
	private String userId;

	private String password;
	private String name;
	private String email;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void update(User newUser) {
		this.password = newUser.password;
		this.name = newUser.name;
		this.email = newUser.email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}

}
