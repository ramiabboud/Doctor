package com.example.demo.DTO;

public class DoctorRequestbody {

	private long id;
    private String firstName;
    private String lastName;
    private int nummber;
    private String password;
    private int age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public int getNummber() {
		return nummber;
	}
	public void setNummber(int nummber) {
		this.nummber = nummber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
}

