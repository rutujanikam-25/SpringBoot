package com.cyber.success.CSJ33SpringBootProject.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Course_Booking")
public class Book {
    @Id
    @GeneratedValue
	private long bookingId;
    @Column(name="book_date")
    @DateTimeFormat(pattern="yyyy-mm-dd")
	private LocalDate bookingDate;
    @Column(name="payment_status")
	private String paymentStatus;
    @Column(name="course_id")
	private long courseId;
    @Column(name="batch_name")
	private String batchName;
    @Column(name="User_name")
	private String userName;
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long bookingId, LocalDate bookingDate, String paymentStatus, long courseId, String batchName,
			String userName) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.paymentStatus = paymentStatus;
		this.courseId = courseId;
		this.batchName = batchName;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Book [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", paymentStatus=" + paymentStatus
				+ ", courseId=" + courseId + ", batchName=" + batchName + ", userName=" + userName + "]";
	}
    
    
}
