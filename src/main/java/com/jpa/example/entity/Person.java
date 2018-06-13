package com.jpa.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="person_tab")
public class Person {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="FIRST_NAME",length=60,nullable=false,unique=true)
	private String firstName;
	@Column(name="LAST_NAME",length=60,nullable=false)
	private String lastName;
	@Column(name="GMAIL",unique=true)
	private String gmail;
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, String gmail, Date creationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gmail = gmail;
		this.creationDate = creationDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gmail=" + gmail
				+ ", creationDate=" + creationDate + "]";
	}
	
	

}
