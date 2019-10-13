package com.CAM.webservices.camwebservices;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persons")
public class Persons {
	
	@Id
	@GeneratedValue
	private Long PersonId;
	
	private String LastName;
	private String FirstName;
	private String City;
	private String Address;
	public Long getId() {
		return PersonId;
	}
	public void setId(Long id) {
		this.PersonId = id;
	}
	public String getLastName() {
		return LastName;
	}
	public Persons() {
		
	}
	public Persons(long i, String lastName, String firstName, String city, String address) {
		super();
		PersonId = i;
		LastName = lastName;
		FirstName = firstName;
		City = city;
		Address = address;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	@Override
	public String toString() {
		return "Persons [id=" + PersonId + ", lastName=" + LastName + ", firstName=" + FirstName + ", city=" + City
				+ ", address=" + Address + "]";
	}
	
	
}
