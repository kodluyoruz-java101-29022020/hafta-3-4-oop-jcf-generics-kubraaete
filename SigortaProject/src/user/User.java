package user;

import java.util.ArrayList;
import java.util.Date;

public class User {
	private String name;
	private String surName;
	private String email;
	private String password;
	private String job;
	private int age;
	private ArrayList addressList;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList getAddressList() {
		return addressList;
	}
	public void setAddressList(ArrayList addressList) {
		this.addressList = addressList;
	}
	public Date getSystemEndLoginDate() {
		return systemEndLoginDate;
	}
	public void setSystemEndLoginDate(Date systemEndLoginDate) {
		this.systemEndLoginDate = systemEndLoginDate;
	}
	private Date systemEndLoginDate;
	

}
