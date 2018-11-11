package com.demo.jpa.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "birthday")
	private Date birthday;

	/**
	 * The default constructor only exists for the sake of JPA. You won’t use it directly, so it is designated as protected.
	 */
	protected User() {
	}

	public User(String name, String password, Date birthday) {
		this.name = name;
		this.password = password;
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
