package com.cyber.success.CSJ33SpringBootProject.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="CS_Admin")

public class Admin {
	@Id
	@GeneratedValue
	@Column(name="admin_id")
	private long adminId;
	@Column(name="admin_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="admin_phone",unique=true)
	private long phone;
	@Column(name="admin_emailId" , unique =true)
	private String emailId;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="admin_dob")
	private LocalDate dob;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	
	public Admin() {
		super();
	}
	public Admin(long adminId, String firstName, String lastName, long phone, String emailId, LocalDate dob,
			User user) {
		super();
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.emailId = emailId;
		this.dob = dob;
		this.user = user;
	}
	public long getAdminId() {
		return adminId;
	}
	public void setAdminId(long adminId) {
		this.adminId = adminId;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", emailId=" + emailId + ", dob=" + dob + ", user=" + user + "]";
	}
	

}
