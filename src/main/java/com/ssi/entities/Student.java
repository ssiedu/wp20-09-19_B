package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Email;

@Entity
public class Student {
	@Id
	private int rno;
	
	@Pattern(regexp="[a-zA-Z]*", message="Only Alphabates Allowed")//only alphbates
	@Size(min=2,max=10, message="Your Name Is Invalid , Please Use 2-10 Chars only")
	private String sname;
	private String address;
	
	
	@Email(message="Invalid Email Id ")
	private String email;
	
	@Max(value=100,message="Maximum Score Can Be 100 Only")
	@Min(value=0, message="Negative Marking Is Not Allowed")
	private int marks;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
