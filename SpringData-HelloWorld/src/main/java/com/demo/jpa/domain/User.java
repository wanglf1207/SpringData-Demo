package com.demo.jpa.domain;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;

	@Column(name = "name")
	private String name;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name="age")
	private Integer age;

	@Column(name = "birthday")
	private Date birthday;

	@Column(name = "address")
	private String address;

	@Column(name = "description")
	private String description;

	/**
	 * The default constructor only exists for the sake of JPA. You won’t use it directly, so it is designated as protected.
	 */
	public User() {
	}

	public User(String name, String phoneNumber, String email, String password, Integer age, Date birthday,String address, String description) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.age = age;
		this.birthday = birthday;
		this.address = address;
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
