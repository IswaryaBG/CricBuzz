//$Id$
package com.cricbuzz.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private String name;
	private String dateOfBirth;
	private Integer age;
    private String homeTown;
    
    public Person() {}

	public Person(String name, String dateOfBirth, Integer age, String homeTown) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.homeTown = homeTown;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
    
    
}


